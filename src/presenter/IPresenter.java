package presenter;
import view.IView;
import model.IModel;



/**
 * @author Olga
 * @version 1.0
 * @created 15-paü-2014 21:59:04
 */
public interface IPresenter {

	public IModel getModel();

	public IView getView();

	/**
	 * 
	 * @param model
	 */
	public void setModel(IModel model);

	/**
	 * 
	 * @param view
	 */
	public void setView(IView view);

}