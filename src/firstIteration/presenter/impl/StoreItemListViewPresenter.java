package firstIteration.presenter.impl;

import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.view.IAddEditStoreItemDialog;
import firstIteration.view.IStoreItemListView;
import firstIteration.view.components.AddEditStoreItemDialog;
import firstIteration.view.components.StoreItemListView;

public class StoreItemListViewPresenter implements IStoreItemListViewPresenter {
	IStoreItemListView view;
	AddEditStoreItemDialog addEditStoreItemDialog;

	public StoreItemListViewPresenter(IStoreItemListView view) {
		this.view = view;
	}
	
	public StoreItemListViewPresenter(AddEditStoreItemDialog addEditStoreItemDialog) {
		this.addEditStoreItemDialog = addEditStoreItemDialog;
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
		this.addEditStoreItemDialog = new AddEditStoreItemDialog();
		addEditStoreItemDialog.setVisible(true);
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
