package com.springboot.Sprinboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @Autowired
    Repo repo;

    @GetMapping("/")
    public List<Model> hello(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public Model find(@RequestBody Model model){
        return repo.save(model);
    }


}
