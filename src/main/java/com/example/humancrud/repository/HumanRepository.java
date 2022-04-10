package com.example.humancrud.repository;

import com.example.humancrud.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepository extends JpaRepository<Human, Integer> {

}
