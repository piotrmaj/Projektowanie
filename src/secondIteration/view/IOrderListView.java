package secondIteration.view;

import dto.OrderDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:53
 */
public interface IOrderListView {

	public void close();

	/**
	 * 
	 * @param o
	 */
	public void showOrder(OrderDTO o);

}