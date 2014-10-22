package presenter.impl;

import presenter.IStoreItemListViewPresenter;
import view.IStoreItemListView;

public class StoreItemListViewPresenter implements IStoreItemListViewPresenter {
	IStoreItemListView view;
	
	public StoreItemListViewPresenter(IStoreItemListView view)
	{
		this.view=view;
	}

	@Override
	public void onConfirmSendButtonClick() {
		view.ShowConfirmSendingDialog();
	}

	
}
