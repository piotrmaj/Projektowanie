package firstIteration.model.impl;

import java.util.List;

import dto.ProductDTO;
import filter.IProductFilter;
import firstIteration.model.IProductModel;

public class FakeProductModel implements IProductModel {

	@Override
	public ProductDTO createProduct(ProductDTO p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductDTO getProduct(int id) {
		ProductDTO p=new ProductDTO();
		p.setName("Produkt");
		p.setId(1);
		p.setDescription("Jakis tam opis");
		p.setUnit("kg.");
		
		return p;
	}

	@Override
	public List<ProductDTO> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getProducts(IProductFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void releaseProductReservation(ProductDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reserveProduct(ProductDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(ProductDTO p) {
		// TODO Auto-generated method stub
		
	}

}
