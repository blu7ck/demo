package com.blu4ck.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NightRepository extends JpaRepository<Night,Long> {

    List<Night> findAll();
}
