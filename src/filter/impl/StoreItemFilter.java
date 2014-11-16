package filter.impl;

import filter.IStoreItemFilter;

public class StoreItemFilter implements IStoreItemFilter {
	
	private String name;
	
	public StoreItemFilter (String name) {
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
