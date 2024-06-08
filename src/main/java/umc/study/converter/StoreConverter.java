package umc.study.converter;

public class StoreConverter {
    public Store convertToEntity(StoreRequestDto storeRequestDto) {
        Store store = new Store();
        store.setName(storeRequestDto.getName());
        store.setLocation(storeRequestDto.getLocation());
        return store;
    }
}
