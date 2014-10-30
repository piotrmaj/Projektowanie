package secondIteration.view;

import java.util.List;

import secondIteration.presenter.ClientPanelPresenter;
import dto.CatalogItemDTO;
import dto.OfferQueryDTO;
import dto.OrderDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:23
 */
public class ClientPanelView implements IClientPanelView {

	public OfferQueryListView m_OfferQueryListView;
	public CatalogListView m_CatalogListView;
	public ClientPanelPresenter m_ClientPanelPresenter;
	public OrderListView m_OrderListView;

	public ClientPanelView(){

	}

	public void finalize() throws Throwable {

	}

	public void close(){

	}

	/**
	 * 
	 * @param items
	 */
	public void showCatalogListView(List<CatalogItemDTO> items){

	}

	/**
	 * 
	 * @param orders
	 */
	public void showCurrentOrderListView(List<OrderDTO> orders){

	}

	/**
	 * 
	 * @param queries
	 */
	public void showOfferQueryListView(List<OfferQueryDTO> queries){

	}

}