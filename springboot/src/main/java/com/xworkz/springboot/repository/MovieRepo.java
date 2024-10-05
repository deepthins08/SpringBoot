package com.xworkz.springboot.repository;

import com.xworkz.springboot.DTO.MovieDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface MovieRepo extends JpaRepository<MovieDTO,Integer> {

}
