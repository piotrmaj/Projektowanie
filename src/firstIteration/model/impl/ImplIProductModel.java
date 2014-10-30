package firstIteration.model.impl;

import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import dto.ProductDTO;
import dto.StoreItemDTO;
import filter.IProductFilter;
import firstIteration.model.IProductModel;
import firstIteration.model.database.DatabaseNode;

public class ImplIProductModel implements IProductModel {

	@Override
	public ProductDTO createProduct(ProductDTO p) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<ProductDTO, Integer> productDao = DaoManager.createDao(conn, ProductDTO.class);
			
			productDao.create(p);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
		
		return p;
	}

	@Override
	public void deleteProduct(int id) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<ProductDTO, Integer> productDao = DaoManager.createDao(conn, ProductDTO.class);
			
			productDao.deleteById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public ProductDTO getProduct(int id) {
		
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<ProductDTO, Integer> productDao = DaoManager.createDao(conn, ProductDTO.class);
			
			return productDao.queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public List<ProductDTO> getProducts() {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<ProductDTO, Integer> productDao = DaoManager.createDao(conn, ProductDTO.class);
			
			return productDao.queryForAll();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public List<ProductDTO> getProducts(IProductFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void releaseProductReservation(ProductDTO p) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			List<StoreItemDTO> results =
					storeItemDao.queryBuilder().where().
					eq("produkt_id", p.getId()).query();
			
			for(StoreItemDTO item : results) {
				item.setAvailable(item.getCount());
				storeItemDao.update(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public void reserveProduct(ProductDTO p) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			List<StoreItemDTO> results =
					storeItemDao.queryBuilder().where().
					eq("produkt_id", p.getId()).query();
			
			for(StoreItemDTO item : results) {
				item.setAvailable(0);
				storeItemDao.update(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public void updateProduct(ProductDTO p) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<ProductDTO, Integer> productDao = DaoManager.createDao(conn, ProductDTO.class);
			
			productDao.update(p);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

}
