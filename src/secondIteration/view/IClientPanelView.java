package secondIteration.view;

import java.util.List;

import dto.CatalogItemDTO;
import dto.OfferQueryDTO;
import dto.OrderDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:06
 */
public interface IClientPanelView {

	public void close();

	/**
	 * 
	 * @param items
	 */
	public void showCatalogListView(List<CatalogItemDTO> items);

	/**
	 * 
	 * @param orders
	 */
	public void showCurrentOrderListView(List<OrderDTO> orders);

	/**
	 * 
	 * @param queries
	 */
	public void showOfferQueryListView(List<OfferQueryDTO> queries);

}