package firstIteration.presenter.impl;

import dto.ProductDTO;
import firstIteration.model.impl.ImplIProductModel;
import firstIteration.presenter.IProductPresenter;
import firstIteration.view.IProductListView;
import firstIteration.view.components.AddEditProductDialog;
import firstIteration.view.components.AddEditStoreItemDialog;
import firstIteration.view.components.DeleteProductDialog;

public class ProductPresenter implements IProductPresenter {
	IProductListView view;
	AddEditProductDialog addEditProductDialog;
	DeleteProductDialog deleteProductDialog;
	ImplIProductModel productModel = new ImplIProductModel();
	

	public ProductPresenter(IProductListView view) {
		this.view = view;
	}
	
	public ProductPresenter(AddEditProductDialog addEditProductDialog) {
		this.addEditProductDialog = addEditProductDialog;
	}
	
	public ProductPresenter(DeleteProductDialog deleteProductDialog) {
		this.deleteProductDialog = deleteProductDialog;
	}	

	@Override
	public void onCreateProductClick() {
		this.addEditProductDialog = new AddEditProductDialog(this);
	//	addEditProductDialog.setVisible(true);	
	}
	
	@Override
	public void onConfirmCreateProductClick(ProductDTO product) {
		productModel.createProduct(product);
		
	}

	@Override
	public void onEditProductClick(int id) {
		// TODO Auto-generated method stub
		
		this.addEditProductDialog = new AddEditProductDialog(this);
		addEditProductDialog.setProduct(productModel.getProduct(id));
		addEditProductDialog.setVisible(true);
		
	}

	@Override
	public void onDeleteProductClick(int id) {
		this.deleteProductDialog = new DeleteProductDialog(this);
		deleteProductDialog.setProduct(productModel.getProduct(id));
	}


	@Override
	public void onConfirmEditProductClick(ProductDTO product) {
		productModel.updateProduct(product);		
	}

	@Override
	public void onConfirmDeleteProductClick(int id) {
		productModel.deleteProduct(id);
	}

	@Override
	public void onViewCreated() {
		view.populateListView(productModel.getProducts());
	}

	
	

}
