package com.blu4ck.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface NightRepository extends JpaRepository<Night,Integer> {

}
