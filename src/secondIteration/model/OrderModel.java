package secondIteration.model;

import java.util.List;

import dto.OrderDTO;



/**
 * @author Kamil
 * @version 1.0
 * @created 30-paü-2014 11:03:11
 */
public class OrderModel implements IOrderModel {

	public OrderModel(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param id
	 */
	public void cancelOrder(int id){

	}

	/**
	 * 
	 * @param clientId
	 */
	public List<OrderDTO> getCurrentOrderList(int clientId){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public OrderDTO getOrder(int id){
		return null;
	}

}