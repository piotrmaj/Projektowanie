package presenter.impl;

import main.StoreItemListView;
import presenter.IStorePresenter;

public class StorePresenter implements IStorePresenter {

	@Override
	public void onProductsButtonClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStoreItemsButtonsClick() {
		StoreItemListView magazine = new StoreItemListView();
		magazine.setVisible(true);
	}

	@Override
	public void onCurrentOrdersButtonClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLogOutButtonClick() {
		// TODO Auto-generated method stub
		
	}

}
