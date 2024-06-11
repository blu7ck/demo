package com.blu4ck.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nights")
public class NightControllers {
    @Autowired
    private NightRepository nightRepository;


    @GetMapping
    public ResponseEntity<List<Nights>> getAllUsers() {
        List<Nights> nights = nightRepository.findAll();
        if (nights.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(nights, HttpStatus.OK);
    }

        @PostMapping
        public ResponseEntity<Nights> createNight(@RequestBody Nights nights) {
            Nights createdNight = nightRepository.save(nights);
            return new ResponseEntity<>(createdNight, HttpStatus.CREATED);

  }
    @GetMapping("/{id}")
    public ResponseEntity<Nights> getUserById(@PathVariable("id") Long id) {
        Nights nights = nightRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Night not found with id: " + id));
        return new ResponseEntity<>(nights, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Nights> updateNight(@PathVariable("id") Long id, @RequestBody Nights nightDetails) {
        Nights nights = nightRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Night not found with id: " + id));

        nights.setNight(nightDetails.getNight());


        Nights updatedNight = nightRepository.save(nights);
        return new ResponseEntity<>(updatedNight, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNight(@PathVariable("id") Long id) {
        nightRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

