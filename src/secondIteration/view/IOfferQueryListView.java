package secondIteration.view;

import dto.OfferQueryDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-pa�-2014 11:02:30
 */
public interface IOfferQueryListView {

	public void close();

	/**
	 * 
	 * @param query
	 */
	public void onShowOfferQuery(OfferQueryDTO query);

}