package umc.study.web.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import umc.study.service.ReviewService.StoreExists;

public class ReviewRequestDTO {
    @NotNull(message = "User ID is required")
    @Min(value = 1, message = "User ID must be a positive integer")
    private Integer userId;

    @NotNull(message = "Store ID is required")
    @Min(value = 1, message = "Store ID must be a positive integer")
    @StoreExists(message = "Store does not exist")
    private Integer storeId;

    @NotBlank(message = "Review content is required")
    private String content;

    @NotNull(message = "Rating is required")
    @Min(value = 1, message = "Rating must be at least 1")
    private Integer rating;

}
