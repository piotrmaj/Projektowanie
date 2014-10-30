package firstIteration.model.database;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Properties;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import dto.ProductDTO;
import dto.StoreItemDTO;
import firstIteration.model.impl.ImplIProductModel;
import firstIteration.model.impl.ImplIStoreItemModel;

public class DatabaseNode {
	
	private static String CONFIG_FILE = "config\\database-properties.xml";
	private static String DBURL;
	private static String DBUSER;
	private static String DBPASS;
	
	private static final DatabaseNode node = new DatabaseNode();
	private static boolean isInitialized = true;
	
	private DatabaseNode () {
		initialize();
	}

	public static DatabaseNode getInstance() {
		if(!isInitialized) {
			node.createTablesIfNotExists();
			isInitialized = true;
		}	
		return node;
	}
	
	private void initialize() {		
		try {
			Properties prop = new Properties();
		    FileInputStream fis = new FileInputStream(new File(CONFIG_FILE));
		    prop.loadFromXML(fis);
		    DBURL = prop.getProperty("database_url");
		    DBUSER = prop.getProperty("user_name");
		    DBPASS = prop.getProperty("password");
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ConnectionSource getConnection(){
		ConnectionSource conn = null;
		try {
			conn = new JdbcConnectionSource(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  
		return conn;
	}
	
	private void createTablesIfNotExists() {
		ConnectionSource conn = null;
		try {
			conn = getConnection();
			TableUtils.createTableIfNotExists(conn, ProductDTO.class);
			TableUtils.createTableIfNotExists(conn, StoreItemDTO.class);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}
	
	public static void main(String[] args)
	{
		ImplIProductModel model=new ImplIProductModel();
		ProductDTO p=new ProductDTO();
		p.setName("Produkt");
		p.setDescription("Jakis tam opis");
		p.setUnit("kg.");
		model.createProduct(p);
		ImplIStoreItemModel itemModel=new ImplIStoreItemModel();
		StoreItemDTO i=new StoreItemDTO();
		i.setName("Pozycja 1");
		i.setCount(5);
		i.setAvailable(5);
		i.setUnit("kg.");
		i.setPrice((float) 20.35);
		itemModel.createStoreItem(i);
		i=new StoreItemDTO();
		i.setName("Deska");
		i.setCount(8);
		i.setAvailable(3);
		i.setUnit("kg.");
		i.setPrice((float) 20.35);
		i.setDescription("Opisik");
		itemModel.createStoreItem(i);
	}

}
