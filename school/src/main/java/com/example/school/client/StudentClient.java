package com.example.school.client;

import com.example.school.SchoolStudents;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient(name = "student-service", url="http://localhost:8090/api/student/")
public interface StudentClient {

    @GetMapping("/school/{id}")
    public List<SchoolStudents> getStudentsBySchoolId(@PathVariable int id);
}
