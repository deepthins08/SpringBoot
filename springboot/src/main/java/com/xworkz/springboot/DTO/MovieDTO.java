package com.xworkz.springboot.DTO;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor@Setter@Getter@NoArgsConstructor@ToString
@Table(name="movies")
public class MovieDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


}
