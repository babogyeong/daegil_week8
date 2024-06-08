package umc.study.web.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.service.StoreService.StoreService;

@RestController
@RequestMapping("/stores")
@Validated
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addStore(@Valid @RequestBody StoreRequestDto storeRequestDto) {
        storeService.addStore(storeRequestDto);
        return new ResponseEntity<>("Store added successfully", HttpStatus.OK);
    }
}
