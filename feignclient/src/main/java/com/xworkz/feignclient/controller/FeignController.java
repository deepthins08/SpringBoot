package com.xworkz.feignclient.controller;

import com.xworkz.feignclient.service.FeignClientService;
import com.xworkz.feignclient.service.FeignClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
