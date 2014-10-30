package secondIteration.view;

import secondIteration.presenter.IOrderPresenter;
import dto.InvoiceDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:55
 */
public interface IOrderView {

	public IOrderPresenter m_IOrderPresenter = null;

	public void close();

	/**
	 * 
	 * @param invoice
	 */
	public void showInvoice(InvoiceDTO invoice);

	/**
	 * 
	 * @param dialogId
	 */
	public void showOrderInfoDialog(int dialogId);

}