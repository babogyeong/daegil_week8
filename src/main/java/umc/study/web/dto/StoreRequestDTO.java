package umc.study.web.dto;

public class StoreRequestDTO {
    @NotBlank(message = "Store name is required")
    private String name;

    @NotBlank(message = "Store location is required")
    private String location;
}
