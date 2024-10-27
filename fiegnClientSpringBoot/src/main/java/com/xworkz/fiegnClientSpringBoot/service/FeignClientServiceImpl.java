package com.xworkz.fiegnClientSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FeignClientServiceImpl {

    @Autowired
    private FeignClientService feignClientService;

    @Value("${tmdb.api.key}")
    private String apiKey;

    public Map<String, Object> searchMovies(String name) {

        return feignClientService.searchMovies(name, apiKey, "en-US", 1);
    }
    }
