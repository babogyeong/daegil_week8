package umc.study.service.ReviewService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import umc.study.repository.StoreRepository;

public class StoreExistsValidator implements ConstraintValidator<StoreExists, Integer> {

    private final StoreRepository storeRepository;

    public StoreExistsValidator(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public void initialize(StoreExists constraintAnnotation) {
    }

    @Override
    public boolean isValid(Integer storeId, ConstraintValidatorContext context) {
        if (storeId == null) {
            return true; // @NotNull 어노테이션으로 null 검사를 처리하기!
        }
        return storeRepository.existsById(storeId);
    }
}
