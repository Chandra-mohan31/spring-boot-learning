package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student man = new Student(
                    "man",
                    "man@gmail.com",
                    21,
                    LocalDate.of(2000, Month.JANUARY,21)

            );
            Student alex = new Student(
                    "alex",
                    "alexman@gmail.com",
                    21,
                    LocalDate.of(2000, Month.JANUARY,21)

            );
            repository.saveAll(
                    List.of(man,alex)
            );
        };
    }
}
