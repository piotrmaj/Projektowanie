package firstIteration.view;

import java.util.List;

import dto.StoreItemDTO;

public interface IStoreItemListView {
	
	void populateListView(List<StoreItemDTO> items);
}
