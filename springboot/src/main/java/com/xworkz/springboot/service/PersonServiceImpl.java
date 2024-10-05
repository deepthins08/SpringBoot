package com.xworkz.springboot.service;

import com.xworkz.springboot.DTO.PersonDTO;
import com.xworkz.springboot.entity.PersonEntity;
import com.xworkz.springboot.repository.PersonRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepo personRepo;

    @Override
    public void save(PersonDTO personDTO) {
        PersonEntity personEntity=new PersonEntity();
        BeanUtils.copyProperties(personDTO,personEntity);
        personRepo.save(personEntity);
    }

    @Override
    public List<PersonDTO> findAll() {

        return personRepo.findAll().stream().map(personEntity -> {
            PersonDTO personDTO=new PersonDTO();
            BeanUtils.copyProperties(personEntity,personDTO);
            return personDTO;
        }).collect(Collectors.toList());
    }

    @Override
    public PersonDTO getById(Integer id) {
       PersonEntity personEntity= personRepo.getById(id);
       PersonDTO personDTO=new PersonDTO();
        BeanUtils.copyProperties(personEntity,personDTO);
        return personDTO;
    }

    @Override
    public PersonDTO getByName(String name) {
        PersonEntity personEntity=personRepo.getByName(name);
        PersonDTO personDTO=new PersonDTO();
        BeanUtils.copyProperties(personEntity,personDTO);
        return personDTO;
    }
}
