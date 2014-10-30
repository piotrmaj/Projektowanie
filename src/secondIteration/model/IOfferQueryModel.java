package secondIteration.model;

import java.util.List;

import dto.OfferQueryDTO;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:14
 */
public interface IOfferQueryModel {

	/**
	 * 
	 * @param queryId
	 */
	public void addQueryProduct(int queryId);

	/**
	 * 
	 * @param id
	 */
	public void finishOfferQuery(int id);

	public List<OfferQueryDTO> getOfferQueryList();

	/**
	 * 
	 * @param id
	 */
	public void removeOfferQuery(int id);

	/**
	 * 
	 * @param id
	 */
	public void removeQueryProduct(int id);

}