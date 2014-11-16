package firstIteration.presenter.impl;

import dto.StoreItemDTO;
import firstIteration.model.impl.ImplIProductModel;
import firstIteration.model.impl.ImplIStoreItemModel;
import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.view.IStoreItemListView;
import firstIteration.view.components.AddEditStoreItemDialog;
import firstIteration.view.components.ConfirmSendingStoreItemDialog;
import firstIteration.view.components.DeleteStoreItemDialog;

public class StoreItemListViewPresenter implements IStoreItemListViewPresenter {
	ImplIStoreItemModel storeModel = new ImplIStoreItemModel();
	ImplIProductModel productModel = new ImplIProductModel();
	IStoreItemListView view;
	AddEditStoreItemDialog addEditStoreItemDialog;
	DeleteStoreItemDialog deleteStoreItemDialog;
	ConfirmSendingStoreItemDialog confirmDialog;

	public StoreItemListViewPresenter(IStoreItemListView view) {
		this.view = view;
	}
	
	public StoreItemListViewPresenter(AddEditStoreItemDialog addEditStoreItemDialog) {
		this.addEditStoreItemDialog = addEditStoreItemDialog;
	}
	
	public StoreItemListViewPresenter(DeleteStoreItemDialog deleteStoreItemDialog) {
		this.deleteStoreItemDialog = deleteStoreItemDialog;
	}
	
	public StoreItemListViewPresenter(ConfirmSendingStoreItemDialog confirmDialog) {
		this.confirmDialog = confirmDialog;
	}

	
	@Override
	public void onConfirmSendButtonClick(int id) {
		confirmDialog = new ConfirmSendingStoreItemDialog(storeModel.getStoreItem(id));
		confirmDialog.setVisible(true);
	}
	
	
	@Override
	public void onUpdateConfirmSendButtonClick(int count, StoreItemDTO storeItemFromView) {
		
		int countToUpdate = storeItemFromView.getCount() - count;
		if(countToUpdate < 0)
			countToUpdate = 0;
		
		storeItemFromView.setCount(countToUpdate);
		storeModel.updateStoreItem(storeItemFromView);
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
		this.addEditStoreItemDialog = new AddEditStoreItemDialog(productModel.getProducts());
		addEditStoreItemDialog.setVisible(true);
	}

	@Override
	public void onEditItemStoreButtonClick(int id) {
		this.addEditStoreItemDialog = new AddEditStoreItemDialog(productModel.getProducts());
		this.addEditStoreItemDialog.setStoreItem(storeModel.getStoreItem(id));
		addEditStoreItemDialog.setVisible(true);
	}
	
	@Override
	public void onConfirmEditItemStoreButtonClick(StoreItemDTO storeItem) {
		storeModel.updateStoreItem(storeItem);		
	}

	@Override
	public void onDeleteItemStoreButtonClick(int id) {
		
		
		StoreItemDTO storeItem = storeModel.getStoreItem(id);
		this.deleteStoreItemDialog = new DeleteStoreItemDialog(storeItem);
		deleteStoreItemDialog.setVisible(true);

	}
	
	@Override
	public void onConfirmDeleteItemStoreButtonClick(StoreItemDTO storeitem) {
		
		storeModel.deleteStoreItem(storeitem);
	}
	
	@Override
	public void onConfirmAddStoreItemButtonClick(StoreItemDTO storeitem) {
		//storeitem = storeModel.getStoreItem(1);
		storeModel.createStoreItem(storeitem);
	}
	

}
