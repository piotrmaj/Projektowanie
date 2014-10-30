package secondIteration.presenter;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:03:05
 */
public interface IOrderPresenter {

	/**
	 * 
	 * @param id
	 */
	public void onCancelOrderButtonClick(int id);

	public void onCloseButtonClick();

	/**
	 * 
	 * @param Id
	 */
	public void onShowInvoiceButtonClick(int Id);

}