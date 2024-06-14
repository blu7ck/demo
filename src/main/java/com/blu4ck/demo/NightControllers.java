package com.blu4ck.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/nights")
public class NightControllers {
    private final NightService nightService;
    private final DataSource dataSource;


    @Autowired
    public NightControllers(NightService nightService, DataSource dataSource) {
        this.nightService = nightService;
        this.dataSource = dataSource;
    }
    @GetMapping("/nights/all")
    public List<Night> getAllNights(){
        return this.nightService.getNights();
    }


    @PostMapping("/")
    public ResponseEntity<Object> createNight(@RequestBody Night night){
        return nightService.newNight(night);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateNightById(@PathVariable Integer id, @RequestBody Night updateNight){
        return this.nightService.updateNight(id, updateNight);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteightById(@PathVariable Integer id){
        return this.nightService.deleteNight(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getNightById(@PathVariable Integer id){
        return this.nightService.getNightById(id);
    }

}


