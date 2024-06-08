package umc.study.web.dto;

import jakarta.validation.constraints.NotNull;

@UniqueMissionCheck
public class MissionRequestDTO {
    @NotNull(message = "Mission ID is required")
    private Long missionId;

    @NotNull(message = "Store ID is required")
    private Long storeId;

}
