package firstIteration.model.impl;

import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import dto.StoreItemDTO;
import filter.IStoreItemFilter;
import firstIteration.model.IStoreItemModel;
import firstIteration.model.database.DatabaseNode;

public class ImplIStoreItemModel implements IStoreItemModel {

	@Override
	public StoreItemDTO createStoreItem(StoreItemDTO item) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			storeItemDao.create(item);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
		
		return item;
	}

	@Override
	public void deleteStoreItem(StoreItemDTO item) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			storeItemDao.delete(item);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public StoreItemDTO getStoreItem(int id) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			return storeItemDao.queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public List<StoreItemDTO> getStoreItems() {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			return storeItemDao.queryForAll();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public List<StoreItemDTO> getStoreItems(IStoreItemFilter filter) {
		if (filter.getName() == null || filter.getName().trim().isEmpty()) {
			return getStoreItems();
		} else {
			ConnectionSource conn = null;
			try {
				conn = DatabaseNode.getInstance().getConnection();
				
				Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
				
				List<StoreItemDTO> storeItems = storeItemDao.queryBuilder().where().
						eq("name", filter.getName()).query();
				
				return storeItems;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} finally {
				if(conn != null)
					conn.closeQuietly();
			}
		}
	}

	@Override
	public void updateStoreItem(StoreItemDTO item) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			storeItemDao.update(item);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				conn.closeQuietly();
		}
	}

	@Override
	public void processSendStoreItems(List<StoreItemDTO> items) {
		ConnectionSource conn = null;
		try {
			conn = DatabaseNode.getInstance().getConnection();
			
			Dao<StoreItemDTO, Integer> storeItemDao = DaoManager.createDao(conn, StoreItemDTO.class);
			
			for(StoreItemDTO item : items) {
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

}
