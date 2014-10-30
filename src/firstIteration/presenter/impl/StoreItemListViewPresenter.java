package firstIteration.presenter.impl;

import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.view.IStoreItemListView;

public class StoreItemListViewPresenter implements IStoreItemListViewPresenter {
	IStoreItemListView view;

	public StoreItemListViewPresenter(IStoreItemListView view) {
		this.view = view;
	}

	@Override
	public void onConfirmSendButtonClick() {
		view.ShowConfirmSendingDialog();
	}

	@Override
	public void onReserveButtonClick() {
		view.ShowReservreStoreItemDialog();

	}
	
	@Override
	public void onReleaseButtonClick() {
		view.ShowReleaseStoreItemDialog();
		
	}

	@Override
	public void onAddItemStoreButtonlClick() {
		view.ShowAddItemDialog();

	}

	@Override
	public void onEditItemStoreButtonClick() {
		view.ShowEditItemDialog();

	}

	@Override
	public void onDeleteItemStoreButtonClick() {
		view.ShowDeleteStoreItemDialog();

	}

}
