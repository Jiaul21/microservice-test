package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public void saveStudent(Student student){
        repository.save(student);
    }

    public List<Student> findAllStudent(){
        return repository.findAll();
    }

    public List<Student> findAllStudentBySchoolId(int id){
        return repository.findAllBySchoolId(id);
    }

}
