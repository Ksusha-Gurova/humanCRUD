package com.example.humancrud.service;

import com.example.humancrud.entity.Human;
import com.example.humancrud.repository.HumanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class HumanServiceImpl implements HumanService{
    private final HumanRepository repository;

    @Override
    public List<Human> findAll() {
        List<Human> allHuman = repository.findAll();
        return allHuman;
    }

    @Override
    public Human findHuman(Integer id) {
        Optional<Human> optionalHuman = repository.findById(id);
        return optionalHuman.get();
    }

    @Override
    public void deleteHuman(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Human updateHuman(Human human) {
        return repository.save(human);
    }

    @Override
    public Human save(Human human) {
        return repository.save(human);
    }
}
