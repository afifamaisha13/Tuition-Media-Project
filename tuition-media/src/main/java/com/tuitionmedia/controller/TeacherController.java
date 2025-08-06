package com.tuitionmedia.controller;

import com.tuitionmedia.model.Teacher;
import com.tuitionmedia.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return service.getAllTeachers();
    }

    @PostMapping
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        return service.saveTeacher(teacher);
    }
}
