package secondIteration.view;

import secondIteration.presenter.OrderListViewPresenter;
import dto.OrderDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:59
 */
public class OrderListView implements IOrderListView {

	public OrderListViewPresenter m_OrderListViewPresenter;
	public OrderView m_OrderView;

	public OrderListView(){

	}

	public void finalize() throws Throwable {

	}

	public void close(){

	}

	/**
	 * 
	 * @param o
	 */
	public void showOrder(OrderDTO o){

	}

}