package com.blu4ck.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nights")
public class NightControllers {
    private final NightService nightService;



    @Autowired
    public NightControllers(NightService nightService) {
        this.nightService = nightService;

    }
    @GetMapping
    public List<Night> getAllNights(){
        return nightService.findAll();
    }


    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Night create(@RequestBody Night night) {
        return nightService.save(night);
    }
    @PutMapping
    public Night update(@RequestBody Night night) {
        return nightService.save(night);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        nightService.deleteById(id);
    }
    @GetMapping("/{id}")
    public Optional<Night> findById(@PathVariable Long id) {
        return nightService.findById(id);
    }

}


