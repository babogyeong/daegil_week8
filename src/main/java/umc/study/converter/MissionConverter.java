package umc.study.converter;

import org.springframework.stereotype.Component;
import umc.study.domain.Mission;

@Component
public class MissionConverter {

    public Mission convertToEntity(MissionRequestDto missionRequestDto) {
        Mission mission = new Mission();
        mission.setMissionId(missionRequestDto.getMissionId());
        mission.setStoreId(missionRequestDto.getStoreId());
        return mission;
    }
}