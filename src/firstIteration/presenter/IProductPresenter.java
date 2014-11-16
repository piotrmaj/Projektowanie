package firstIteration.presenter;

import dto.ProductDTO;
import dto.StoreItemDTO;

public interface IProductPresenter {
	
	void onCreateProductClick();

	void onEditProductClick(int id);

	void onDeleteProductClick(int id);
	
	void onConfirmCreateProductClick(ProductDTO product);

	void onConfirmEditProductClick(ProductDTO product);

	void onConfirmDeleteProductClick(int id);
}
