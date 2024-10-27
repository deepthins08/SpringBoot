package com.xworkz.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@FeignClient(name = "tmdbClient",url = "https://api.themoviedb.org/3")
public interface FeignClientService {

    @GetMapping("/search/movie")
    Map<String, Object> searchMovies(
            @RequestParam("query") String query,
            @RequestParam("api_key") String apiKey,
            @RequestParam("language") String language,
            @RequestParam("page") int page
    );
}
