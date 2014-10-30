package firstIteration.presenter.impl;

import java.util.ArrayList;

import dto.ProductDTO;
import dto.StoreItemDTO;
import firstIteration.model.IProductModel;
import firstIteration.model.IStoreItemModel;
import firstIteration.model.impl.ImplIProductModel;
import firstIteration.model.impl.ImplIStoreItemModel;
import firstIteration.presenter.IStorePresenter;
import firstIteration.view.IStoreView;

public class StorePresenter implements IStorePresenter {
	IStoreView view;
	IStoreItemModel storeItemModel;
	IProductModel productModel;
	
	public StorePresenter(IStoreView view)
	{
		this.view=view;
		storeItemModel=new ImplIStoreItemModel(); 
		productModel = new ImplIProductModel();
	}
	
	
	@Override
	public void onProductsButtonClick() {
		ArrayList<ProductDTO> products=(ArrayList<ProductDTO>) productModel.getProducts();
		view.ShowProductListView(products);
	}

	@Override
	public void onStoreItemsButtonsClick() {
		ArrayList<StoreItemDTO> items=(ArrayList<StoreItemDTO>) storeItemModel.getStoreItems();
		view.ShowStoreItemListView(items);
	}

	@Override
	public void onCurrentOrdersButtonClick() {
		view.ShowCurrentOrderListView();
	}

	@Override
	public void onLogOutButtonClick() {
		//model.closeConnection();
		view.CloseStoreView();
	}

}
