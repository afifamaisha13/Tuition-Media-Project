package com.tuitionmedia.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String studentClass;
    private String subjectRequirement;
    private String teacherType;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStudentClass() { return studentClass; }
    public void setStudentClass(String studentClass) { this.studentClass = studentClass; }
    public String getSubjectRequirement() { return subjectRequirement; }
    public void setSubjectRequirement(String subjectRequirement) { this.subjectRequirement = subjectRequirement; }
    public String getTeacherType() { return teacherType; }
    public void setTeacherType(String teacherType) { this.teacherType = teacherType; }
}
