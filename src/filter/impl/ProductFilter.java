package filter.impl;

import filter.IProductFilter;

public class ProductFilter implements IProductFilter {
	private String name;
	
	public ProductFilter (String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

}
