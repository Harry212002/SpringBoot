package com.harry.spring_security_demo.controller;

import com.harry.spring_security_demo.model.Students;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studenController {

    // Sample list of students
    List<Students> students = new ArrayList<>(List.of(
            new Students(1, "Harry", "Java"),
            new Students(2, "Shrihari", "JavaScript")
    ));

    @GetMapping("/getcsrftoken")
    public CsrfToken getcsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    // Endpoint to retrieve all students
    @GetMapping("/students")
    public List<Students> getStudents() {
        return students;
    }

    // Endpoint to add a new student
    @PostMapping("/students")
    public void addStudent(@RequestBody Students student) {
        // Add the new student to the list
        students.add(student);

    }
}
