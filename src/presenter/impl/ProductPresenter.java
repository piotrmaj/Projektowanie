package presenter.impl;

import presenter.IProductPresenter;
import view.IProductListView;

public class ProductPresenter implements IProductPresenter {
	IProductListView view;

	public ProductPresenter(IProductListView view) {
		this.view = view;
	}

	@Override
	public void onCreateProductClick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEditProductClick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDeleteProductClick() {
		// TODO Auto-generated method stub

	}

}
