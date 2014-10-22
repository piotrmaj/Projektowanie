package model;
import java.util.List;

import presenter.IStoreItemPresenter;
import dto.StoreItemDTO;
import filter.IStoreItemFilter;



/**
 * @author User
 * @version 1.0
 * @created 15-pa�-2014 21:59:43
 */
public interface IStoreItemModel {

	public IStoreItemPresenter m_IntefejsPrezenteraPozycjiWMagazynie = null;

	/**
	 * 
	 * @param item
	 */
	public StoreItemDTO createStoreItem(StoreItemDTO item);

	/**
	 * 
	 * @param item
	 */
	public void deleteStoreItem(StoreItemDTO item);

	/**
	 * 
	 * @param item
	 */
	public StoreItemDTO getStoreItem(int id);

	public List<StoreItemDTO> getStoreItems();

	/**
	 * 
	 * @param filter
	 */
	public List<StoreItemDTO> getStoreItems(IStoreItemFilter filter);

	/**
	 * 
	 * @param items
	 */
	public void processSendStoreItems(List<StoreItemDTO> items);

	/**
	 * 
	 * @param item
	 */
	public void updateStoreItem(StoreItemDTO item);

}