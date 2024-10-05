package com.xworkz.springboot.service;

import com.xworkz.springboot.DTO.PersonDTO;
import com.xworkz.springboot.entity.PersonEntity;

import java.util.List;

public interface PersonService {

    void save(PersonDTO personDTO);

    List<PersonDTO> findAll();

    PersonDTO getById(Integer id);

    PersonDTO getByName(String name);


}
