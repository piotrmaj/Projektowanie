package firstIteration.model;
import java.util.List;

import dto.ProductDTO;
import filter.IProductFilter;



/**
 * @author User
 * @version 1.0
 * @created 15-paü-2014 22:00:06
 */
public interface IProductModel {

	
	/**
	 * 
	 * @param p
	 */
	public ProductDTO createProduct(ProductDTO p);

	/**
	 * 
	 * @param id
	 */
	public void deleteProduct(int id);

	/**
	 * 
	 * @param p
	 */
	public ProductDTO getProduct(int id);

	public List<ProductDTO> getProducts();

	/**
	 * 
	 * @param filter
	 */
	public List<ProductDTO> getProducts(IProductFilter filter);

	/**
	 * 
	 * @param p
	 */
	public void releaseProductReservation(ProductDTO p);

	/**
	 * 
	 * @param p
	 */
	public void reserveProduct(ProductDTO p);

	/**
	 * 
	 * @param p
	 */
	public void updateProduct(ProductDTO p);

}