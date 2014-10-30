package secondIteration.presenter;

/**
 * @author Piotr
 * @version 1.0
 * @created 30-pa�-2014 11:02:49
 */
public interface IOfferQueryPresenter {

	/**
	 * 
	 * @param Id
	 */
	public void onCancelQueryOfferButtonClick(int Id);

	public void onCloseButtonClick();

	/**
	 * 
	 * @param Id
	 */
	public void onFinishQueryOfferButtonClick(int Id);

}