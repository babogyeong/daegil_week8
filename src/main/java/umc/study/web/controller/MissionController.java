package umc.study.web.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.service.MissionService.MissionService;

@RestController
@RequestMapping("/missions")
public class MissionController {
    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMission(@Valid @RequestBody MissionRequestDto missionRequestDto) {
        missionService.addMission(missionRequestDto);
        return new ResponseEntity<>("Mission added successfully", HttpStatus.OK);
    }
}
