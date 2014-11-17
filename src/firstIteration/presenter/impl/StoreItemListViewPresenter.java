package firstIteration.presenter.impl;

import dto.ProductDTO;
import dto.StoreItemDTO;
import firstIteration.model.impl.ImplIProductModel;
import firstIteration.model.impl.ImplIStoreItemModel;
import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.view.IStoreItemListView;
import firstIteration.view.components.AddEditStoreItemDialog;
import firstIteration.view.components.ConfirmSendingStoreItemDialog;
import firstIteration.view.components.DeleteStoreItemDialog;
import firstIteration.view.components.ReserveStoreItemDialog;

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
	public void onReserveButtonClick(int id) {
        StoreItemDTO storeItem = storeModel.getStoreItem(id);
        ReserveStoreItemDialog reserveStoreItemDialog = new ReserveStoreItemDialog(storeItem);
        reserveStoreItemDialog.setVisible(true);
    }
	
	@Override
	public void onReleaseButtonClick() {
		//TODO okno dialogowo z zwolnieniem rezerwacji
		
	}


	@Override
	public void onAddItemStoreButtonlClick() {
		this.addEditStoreItemDialog = new AddEditStoreItemDialog(this, productModel.getProducts());
		addEditStoreItemDialog.setVisible(true);
	}

	@Override
	public void onEditItemStoreButtonClick(int id) {
		this.addEditStoreItemDialog = new AddEditStoreItemDialog(this, productModel.getProducts());
		StoreItemDTO storeItem = storeModel.getStoreItem(id);
		System.out.println(storeItem.getId());
		this.addEditStoreItemDialog.setStoreItem(storeItem);
		addEditStoreItemDialog.setVisible(true);
	}
	
	@Override
	public void onConfirmEditItemStoreButtonClick(StoreItemDTO storeItem) {
		storeModel.updateStoreItem(storeItem);
		view.populateListView(storeModel.getStoreItems());
	}

	@Override
	public void onDeleteItemStoreButtonClick(int id) {
		StoreItemDTO storeItem = storeModel.getStoreItem(id);
		ProductDTO productItem = productModel.getProduct(storeItem.getProductId());
		this.deleteStoreItemDialog = new DeleteStoreItemDialog(this, storeItem, productItem);
		deleteStoreItemDialog.setVisible(true);

	}
	
	@Override
	public void onConfirmDeleteItemStoreButtonClick(StoreItemDTO storeitem) {
		storeModel.deleteStoreItem(storeitem);
		view.populateListView(storeModel.getStoreItems());
	}
	
	@Override
	public void onConfirmAddStoreItemButtonClick(StoreItemDTO storeitem) {
		storeModel.createStoreItem(storeitem);
		view.populateListView(storeModel.getStoreItems());
	}

	@Override
	public void onStoreItemListViewCreated() {
		view.populateListView(storeModel.getStoreItems());	
	}
	

}
