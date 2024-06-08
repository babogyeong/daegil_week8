package umc.study.service.MissionService;


import org.springframework.stereotype.Service;
import umc.study.domain.Mission;
import umc.study.domain.enums.MissionStatus;
import umc.study.repository.MissionRepository;

@Service
public class MissionServiceImpl implements MissionService {

    private final MissionRepository missionRepository;
    private final MissionConverter missionConverter;

    public MissionServiceImpl(MissionRepository missionRepository, MissionConverter missionConverter) {
        this.missionRepository = missionRepository;
        this.missionConverter = missionConverter;
    }

    @Override
    @Transactional
    public void addMission(MissionRequestDto missionRequestDto) {
        // 미션 중복 도전 검증
        if (missionRepository.findByStoreIdAndMissionId(missionRequestDto.getStoreId(), missionRequestDto.getMissionId()).isPresent()) {
            throw new MissionAlreadyInProgressException("This mission is already in progress for the store.");
        }

        Mission mission = missionConverter.convertToEntity(missionRequestDto);
        mission.setStatus(MissionStatus.CHALLENGING);  // Set the status to CHALLENGING
        missionRepository.save(mission);
    }
}
