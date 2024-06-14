package com.blu4ck.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NightService {
    private final NightRepository nightRepository;
    @Autowired
    public NightService(NightRepository nightRepository) {
        this.nightRepository = nightRepository;
    }

    public ResponseEntity<Object> newNight(Night night){
        nightRepository.save(night);
        return new ResponseEntity<>(night, HttpStatus.CREATED);
    }

    public List<Night> getNights(){
        return this.nightRepository.findAll();
    }

    public ResponseEntity<Object> updateNight(Integer id, Night updatedNight){
        Optional<Night> nightOptional = nightRepository.findById(id);

        if(!nightOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        Night existingNight = nightOptional.get();

        existingNight.setNight(updatedNight.getNight());
        existingNight.setId(updatedNight.getId());
        nightRepository.save(existingNight);
        return ResponseEntity.ok(existingNight);
    }

    public ResponseEntity<Object> deleteNight(Integer id) {
        Optional<Night> nightOptional = nightRepository.findById(id);

        if (!nightOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        nightRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Object> getNightById(Integer id){
        Optional<Night> nightOptional = nightRepository.findById(id);

        if(!nightOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }
        Night night = nightOptional.get();

        return ResponseEntity.ok(night);
    }
}
