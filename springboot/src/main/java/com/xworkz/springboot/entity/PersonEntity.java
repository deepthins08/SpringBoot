package com.xworkz.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor@NoArgsConstructor@Setter@Getter@ToString
@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String gender;
}
