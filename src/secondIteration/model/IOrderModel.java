package secondIteration.model;

import java.util.List;

import dto.OrderDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:11
 */
public interface IOrderModel {

	/**
	 * 
	 * @param id
	 */
	public void cancelOrder(int id);

	/**
	 * 
	 * @param clientId
	 */
	public List<OrderDTO> getCurrentOrderList(int clientId);

	/**
	 * 
	 * @param id
	 */
	public OrderDTO getOrder(int id);

}