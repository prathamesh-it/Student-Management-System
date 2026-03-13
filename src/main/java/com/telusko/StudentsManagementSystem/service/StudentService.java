package com.telusko.StudentsManagementSystem.service;


import com.telusko.StudentsManagementSystem.entity.Student;

import java.util.List;

public interface StudentService
{
    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student getById(Integer id);

    public void deleteStudent(Integer id);
}
