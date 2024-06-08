package umc.study.service.ReviewService;

import org.springframework.stereotype.Service;
import umc.study.domain.Review;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewConverter reviewConverter;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewConverter reviewConverter) {
        this.reviewRepository = reviewRepository;
        this.reviewConverter = reviewConverter;
    }

    @Override
    public ReviewResponseDTO addReview(ReviewRequestDTO reviewRequestDTO) {
        Review review = reviewConverter.convertToEntity(reviewRequestDTO);
        Review savedReview = reviewRepository.save(review);
        return reviewConverter.convertToDTO(savedReview);
    }
}
