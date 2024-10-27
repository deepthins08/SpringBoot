package com.xworkz.springboot.controller;

import com.xworkz.springboot.DTO.MovieDTO;
import com.xworkz.springboot.DTO.PersonDTO;
import com.xworkz.springboot.repository.MovieRepo;
import com.xworkz.springboot.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
@Slf4j
public class MovieController {
    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private PersonService personService;
    private PersonService personService1;

    public MovieController(){
        System.out.println("running MovieController");
    }

    @PostMapping
    public ResponseEntity<String> onSave(@RequestBody PersonDTO personDTO){
        System.out.println("Running onSave");
        log.info("{}",personDTO);
        personService.save(personDTO);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/list")
    public ResponseEntity<List<PersonDTO>> getList(){
        System.out.println(personService.findAll());
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getById(@PathVariable int id){
        log.info("running getById");

        return ResponseEntity.ok(personService.getById(id));

    }

    @GetMapping("name/{name}")
    public ResponseEntity<PersonDTO> getByName(@PathVariable String name){
        log.info("running getByName");
        return ResponseEntity.ok(personService.getByName(name));
    }


    @GetMapping
    public List<MovieDTO> getMovies(){
        System.out.println("running getMovies");
        return movieRepo.findAll();
    }

    //config swagger api
    //config logback or sl4j
//    @PostMapping
//    public String saveMovies(){
//        MovieDTO movieDTO=new MovieDTO();
//        movieDTO.setName("Game Changer");
//        movieRepo.save(movieDTO);
//        return "saved";
//    }

}
