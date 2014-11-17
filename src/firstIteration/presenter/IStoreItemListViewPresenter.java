package firstIteration.presenter;

import dto.StoreItemDTO;

public interface IStoreItemListViewPresenter {

void onConfirmSendButtonClick(int id);
	
	void onReserveButtonClick(int id);
	
	void onReleaseButtonClick(int id);
	
	void onAddItemStoreButtonlClick();

	void onDeleteItemStoreButtonClick(int id);
	
	void onConfirmDeleteItemStoreButtonClick(StoreItemDTO storeitem);
	
	void onConfirmAddStoreItemButtonClick(StoreItemDTO storeitem);

	void onUpdateConfirmSendButtonClick(int count, StoreItemDTO storeItemFromView);

	void onEditItemStoreButtonClick(int id);

	void onConfirmEditItemStoreButtonClick(StoreItemDTO storeItem);

    String onConfimReserveStoreItemButtonClicked(String amount, StoreItemDTO storeItem);

    String onConfimReleaseStoreItemReservationButtonClicked(String amount, StoreItemDTO storeItem);

    void onStoreItemListViewCreated();
}
