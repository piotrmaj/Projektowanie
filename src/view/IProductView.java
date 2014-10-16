package view;
import java.util.List;

import presenter.IPresenter;
import dto.ProductDTO;



/**
 * @author User
 * @version 1.0
 * @created 15-paü-2014 22:00:23
 */
public interface IProductView extends IView {

	public IPresenter getPresenter();

	public void onAddButtonClicked();

	public void onDeleteButtonClicked();

	public void onEditButtonClicked();

	public void onReleaseReservationButtonClicked();

	public void onReserveButtonClicked();

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
	public void setDisplay(List<ProductDTO> products);

	public void showCreateForm();

	public void showEditForm();

}