package presenter.impl;

import java.awt.EventQueue;

import main.MagazineItemListView;
import main.StoreItemListView;
import presenter.IStorePresenter;
import view.IStoreView;

public class StorePresenter implements IStorePresenter {
	IStoreView view;
	
	public StorePresenter(IStoreView view)
	{
		this.view=view;
	}
	
	
	@Override
	public void onProductsButtonClick() {
		view.ShowProductListView();
	}

	@Override
	public void onStoreItemsButtonsClick() {
		view.ShowStoreItemListView();
		
		
	}

	@Override
	public void onCurrentOrdersButtonClick() {
		view.ShowCurrentOrderListView();
	}

	@Override
	public void onLogOutButtonClick() {
		//model.closeConnection();
		view.CloseStoreView();
	}

}
