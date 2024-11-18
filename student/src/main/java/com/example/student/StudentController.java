package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        System.out.println("*********** student save ***********");
        service.saveStudent(student);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAllStudent() {
        System.out.println("*********** student findAll ***********");
        return service.findAllStudent();
    }

    @GetMapping("/school/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getStudentsBySchoolId(@PathVariable int id) {
        return service.findAllStudentBySchoolId(id);
    }
}
