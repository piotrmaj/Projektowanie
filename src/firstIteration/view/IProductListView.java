package firstIteration.view;

import java.util.List;

import dto.ProductDTO;
import dto.StoreItemDTO;

public interface IProductListView {
	
		public void populateListView(List<ProductDTO> items);
}
