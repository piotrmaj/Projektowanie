package view;
import presenter.IPresenter;



/**
 * @author Olga
 * @version 1.0
 * @created 15-paü-2014 22:00:52
 */
public interface IView {

	public void onLoad();

	/**
	 * 
	 * @param presenter
	 */
	public void setPresenter(IPresenter presenter);

	/**
	 * 
	 * @param msg
	 */
	public void showErrorNotification(String msg);

	/**
	 * 
	 * @param msg
	 */
	public void showSuccessNotification(String msg);

}