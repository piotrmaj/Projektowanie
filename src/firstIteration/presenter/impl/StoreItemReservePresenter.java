package firstIteration.presenter.impl;

import dto.StoreItemDTO;
import firstIteration.model.IStoreItemModel;
import firstIteration.model.impl.ImplIStoreItemModel;
import firstIteration.presenter.IStoreItemReservePresenter;

public class StoreItemReservePresenter implements IStoreItemReservePresenter {

    private IStoreItemModel storeItemModel = new ImplIStoreItemModel();

    @Override
    public String onReserveButtonClicked(String amount, StoreItemDTO dto) {
        if (amount.isEmpty()) {
            return "Pole 'ilość' nie może być puste";
        }

        int amountValue;
        try {
            amountValue = Integer.parseInt(amount);
        } catch (NumberFormatException ex) {
            return "Pole 'ilość' powinno zawierać liczbę całkowitą";
        }

        if (amountValue < 0) {
            return "Pole 'ilość' powinno zawierać liczbę większą od zera";
        }

        if (amountValue > dto.getAvailable()) {
            return "Nie można zarezerwować - podano ilość większą niż dostępna ilość produktów";
        }

        dto.setAvailable(dto.getAvailable() - amountValue);
        storeItemModel.updateStoreItem(dto);
        return null;
    }

}
