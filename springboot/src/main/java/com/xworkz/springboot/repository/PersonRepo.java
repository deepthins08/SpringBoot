package com.xworkz.springboot.repository;

import com.xworkz.springboot.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<PersonEntity,Integer> {

    PersonEntity getByName(String name);
}
