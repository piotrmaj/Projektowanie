package firstIteration.view.components;

import javax.swing.JDialog;

import dto.ProductDTO;
import firstIteration.presenter.IProductPresenter;
import firstIteration.presenter.impl.ProductPresenter;

public class DeleteProductDialog extends JDialog {
	private ProductDTO product;
	private IProductPresenter presenter;

	public DeleteProductDialog(IProductPresenter productPresenter) {
		this.presenter = productPresenter;
		// TODO Auto-generated constructor stub
	}
	
	public void setProduct(ProductDTO product){
		this.product = product;
	}

}
