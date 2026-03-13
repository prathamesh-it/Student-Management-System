package com.telusko.StudentsManagementSystem;

import com.telusko.StudentsManagementSystem.entity.Student;
import com.telusko.StudentsManagementSystem.repository.StudentRepository;
import com.telusko.StudentsManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents()
    {
        List<Student> list = studentRepository.findAll();
        return list;
    }

    @Override
    public Student saveStudent(Student student) {
        System.out.println(student);
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
