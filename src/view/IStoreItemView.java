package view;
import java.util.List;

import presenter.IPresenter;
import dto.StoreItemDTO;



/**
 * @author User
 * @version 1.0
 * @created 15-paü-2014 22:00:40
 */
public interface IStoreItemView extends IView {

	public IPresenter getPresenter();

	public void onConfirmSendButtonClicked();

	public void onCreateButtonClicked();

	public void onDeleteButtonClicked();

	public void onSubmitCreateForm();

	/**
	 * 
	 * @param presenter
	 */
	public void setDisplay(IPresenter presenter);

	/**
	 * 
	 * @param products
	 */
	public void setDisplay(List<StoreItemDTO> products);

	public void showCreateForm();

}