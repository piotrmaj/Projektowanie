package model.impl;

import java.sql.SQLException;
import java.util.List;

import model.IStoreItemModel;
import model.database.DatabaseNode;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import dto.StoreItemDTO;
import filter.IStoreItemFilter;

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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
	}

}
