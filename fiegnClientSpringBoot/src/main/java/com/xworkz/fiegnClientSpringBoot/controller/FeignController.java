package com.xworkz.fiegnClientSpringBoot.controller;


import com.xworkz.fiegnClientSpringBoot.service.FeignClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/feignDemo")
public class FeignController {

    @Autowired
    private FeignClientServiceImpl feignClientService;




    @GetMapping("/movies")
    public Map<String, Object> getMovies(@RequestParam String name) {
        return feignClientService.searchMovies(name);
    }



}
