package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody School school){
        System.out.println("*********** school save ***********");
        service.saveSchool(school);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<School> findAllSchool(){
        System.out.println("*********** school findAll ***********");
        return service.findAllSchool();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<SchoolStudents> getStudentsBySchoolId(@PathVariable int id){
        return service.getAllStudentBySchoolId(id);
    }
}
