package firstIteration.presenter;

import dto.StoreItemDTO;

public interface IStoreItemReservePresenter {
    String onReserveButtonClicked(String amount, StoreItemDTO dto);
}
