package secondIteration.view;

import secondIteration.presenter.OfferQueryListViewPresenter;
import dto.OfferQueryDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:38
 */
public class OfferQueryListView implements IOfferQueryListView {

	public OfferQueryView m_OfferQueryView;
	public OfferQueryListViewPresenter m_OfferQueryListViewPresenter;

	public OfferQueryListView(){

	}

	public void finalize() throws Throwable {

	}

	public void close(){

	}

	/**
	 * 
	 * @param query
	 */
	public void onShowOfferQuery(OfferQueryDTO query){

	}

}