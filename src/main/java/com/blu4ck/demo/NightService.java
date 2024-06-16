package com.blu4ck.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NightService {

    @Autowired
    private final NightRepository nightRepository;


    public NightService(NightRepository nightRepository) {
        this.nightRepository = nightRepository;
    }

    public List<Night> findAll() {
        return nightRepository.findAll();
    }

    public Optional<Night> findById(Long id) {
        return nightRepository.findById(id);
    }

    public Night save(Night night) {
        return nightRepository.save(night);
    }

    public void deleteById(Long id) {
        nightRepository.deleteById(id);

    }
}
