package com.example.humancrud.controller;

import com.example.humancrud.entity.Human;
import com.example.humancrud.service.HumanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class Controller {
    private final HumanService service;

    public Controller(HumanService service) {
        this.service = service;
    }

    @GetMapping("/findAll")
    public List<Human> findAll(){
        return service.findAll();
    }

    @GetMapping
    public Human findHuman(@RequestParam Integer id){
        return service.findHuman(id);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteHuman(@PathVariable Integer id){
        service.deleteHuman(id);
    }

    @PutMapping("/{id}/update")
    public Human updateHuman(@RequestBody Human human){
        System.out.println("update");
        System.out.println(human);
        return service.updateHuman(human);
    }

    @PostMapping
    public Human saveNewHuman (@RequestBody Human human){
        System.out.println("controller");
        System.out.println(human);
        return service.save(human);
    }
}
