package presenter.impl;

import model.IModel;
import dto.ProductDTO;
import presenter.IProductPresenter;
import view.IView;

public class ImplIProductPresenter implements IProductPresenter {
	private IModel model;
	private IView view;
	
	
	@Override
	public IModel getModel() {
		return model;
	}

	@Override
	public IView getView() {
		return view;
	}

	@Override
	public void setModel(IModel model) {
		this.model=model;
	}

	@Override
	public void setView(IView view) {
		this.view=view;
	}

	@Override
	public void onAddButtonClicked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDeleteButtonClicked(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEditButtonClicked(ProductDTO imodel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReleaseReservationButtonClicked(ProductDTO imodel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReserveButtonClicked(ProductDTO imodel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSubmitCreateForm(ProductDTO product) {
		// TODO Auto-generated method stub
		
	}

}
