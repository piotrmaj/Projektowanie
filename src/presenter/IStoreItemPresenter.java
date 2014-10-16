package presenter;
import java.util.List;

import view.IStoreItemView;
import view.ViewStoreItemEventHandler;
import model.IStoreItemModel;
import dto.StoreItemDTO;



/**
 * @author User
 * @version 1.0
 * @created 15-paü-2014 21:59:34
 */
public interface IStoreItemPresenter extends IPresenter {

	public IStoreItemModel m_InterfejsPozycjiWMagazynie = null;
	public ViewStoreItemEventHandler m_ViewStoreItemEventHandler = null;
	public IStoreItemView m_InterfejsWidokuPozycjiWMagazynie = null;

	public void onAddButtonClicked();

	public void onCancelReservationButtonClicked();

	/**
	 * 
	 * @param items
	 */
	public void onConfirmSendButtonClicked(List<StoreItemDTO> items);

	/**
	 * 
	 * @param item
	 */
	public void onCreateButtonClicked(StoreItemDTO item);

	/**
	 * 
	 * @param id
	 */
	public void onDeleteButtonClicked(int id);

	public void onReservationButtonClicked();

	/**
	 * 
	 * @param item
	 */
	public void onSubmitCreateForm(StoreItemDTO item);

}