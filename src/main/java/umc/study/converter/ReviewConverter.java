package umc.study.converter;

import org.springframework.stereotype.Component;
import umc.study.domain.Review;

@Component
public class ReviewConverter {
    public static ReviewResponseDTO convertToDTO(Review review) {
        ReviewResponseDTO reviewResponseDTO = new ReviewResponseDTO();
        reviewResponseDTO.setId(review.getId());
        reviewResponseDTO.setUserId(review.getUserId());
        reviewResponseDTO.setStoreId(review.getStoreId());
        reviewResponseDTO.setContent(review.getContent());
        reviewResponseDTO.setRating(review.getRating());
        return reviewResponseDTO;
    }
}
