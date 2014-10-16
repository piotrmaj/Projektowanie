package presenter;
import view.IProductView;
import view.ViewProductEventHandler;
import model.IProductModel;
import dto.ProductDTO;



/**
 * @author User
 * @version 1.0
 * @created 15-paŸ-2014 21:59:55
 */
public interface IProductPresenter extends IPresenter {

	public IProductView m_InterfejsWidokuProduktów = null;
	public ViewProductEventHandler m_ViewProductEventHandler = null;
	public IProductModel  m_InterfejsProduktów = null;

	public void onAddButtonClicked();

	/**
	 * 
	 * @param id
	 */
	public void onDeleteButtonClicked(int id);

	/**
	 * 
	 * @param imodel
	 */
	public void onEditButtonClicked(ProductDTO imodel);

	/**
	 * 
	 * @param imodel
	 */
	public void onReleaseReservationButtonClicked(ProductDTO imodel);

	/**
	 * 
	 * @param imodel
	 */
	public void onReserveButtonClicked(ProductDTO imodel);

	/**
	 * 
	 * @param product
	 */
	public void onSubmitCreateForm(ProductDTO product);

}