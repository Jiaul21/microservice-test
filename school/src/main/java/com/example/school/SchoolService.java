package com.example.school;

import com.example.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;
    private final StudentClient client;

    public void saveSchool(School school){
        repository.save(school);
    }

    public List<School> findAllSchool(){
        return repository.findAll();
    }

    public List<SchoolStudents> getAllStudentBySchoolId(int id){
        return client.getStudentsBySchoolId(id);
    }

}
