package umc.study.service.StoreService;


import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;
    private final StoreConverter storeConverter;

    public StoreServiceImpl(StoreRepository storeRepository, StoreConverter storeConverter) {
        this.storeRepository = storeRepository;
        this.storeConverter = storeConverter;
    }

    @Override
    public void addStore(StoreRequestDto storeRequestDto) {
        Store store = storeConverter.convertToEntity(storeRequestDto);
        storeRepository.save(store);
    }
}
