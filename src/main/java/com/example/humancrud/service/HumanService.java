package com.example.humancrud.service;

import com.example.humancrud.entity.Human;

import java.util.List;

public interface HumanService {
    List<Human> findAll();

    Human findHuman(Integer id);

    void deleteHuman(Integer id);

    Human updateHuman(Human human);

    Human save(Human human);
}
