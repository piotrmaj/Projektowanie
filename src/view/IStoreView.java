package view;

import java.util.List;
import dto.ProductDTO;
import dto.StoreItemDTO;


public interface IStoreView {
	void ShowProductListView(List<ProductDTO> products);
	
	void ShowStoreItemListView(List<StoreItemDTO> storeItems);
	
	void ShowCurrentOrderListView();
	
	void CloseStoreView();
}
