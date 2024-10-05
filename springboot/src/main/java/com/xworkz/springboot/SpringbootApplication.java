package com.xworkz.springboot;

import com.xworkz.springboot.DTO.MovieDTO;
import com.xworkz.springboot.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}

	@Autowired
	private MovieRepo movieRepo;

	@Override
	public void run(String... args) throws Exception {
		MovieDTO movieDTO=new MovieDTO();
		movieDTO.setName("Avengers");
		movieRepo.save(movieDTO);

		MovieDTO movieDTO1=new MovieDTO();
		movieDTO1.setName("Devara");
		movieRepo.save(movieDTO1);
	}
}
