package com.example.demo.teachers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/teacher")
public class TeacherController {
    @GetMapping
    public List<Teacher> getTeachers() {
        return List.of(
                new Teacher(
                        1L,
                        "man",
                        "man@gmail.com",
                        21,
                        LocalDate.of(2000, Month.JANUARY,21)

                )
        );
    }
}
