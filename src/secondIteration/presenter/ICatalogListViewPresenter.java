package secondIteration.presenter;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-paü-2014 11:02:18
 */
public interface ICatalogListViewPresenter {

	public void onAddOfferQueryProductButtonClick();

	/**
	 * 
	 * @param id
	 */
	public void onFinishOfferQueryButtonClick(int id);

	/**
	 * 
	 * @param id
	 */
	public void onRemoveOfferQueryProductButtonClick(int id);

}