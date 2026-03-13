package com.telusko.StudentsManagementSystem.controller;

import com.telusko.StudentsManagementSystem.entity.Student;
import com.telusko.StudentsManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }
    //Model -> container usally use to send data from controller to view

    @GetMapping("/students")
    public String getAllStudents(Model model)
    {
        model.addAttribute("students" , studentService.getAllStudents());
        return "students";  //view
    }

    @GetMapping("/students/new")
    public String createStudent(Model model)
    {
        Student student = new Student(); //  to hold the student object
        model.addAttribute("students" , student);
        return "create-student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student)
    {
        studentService.saveStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Integer id , Model model)
    {
        model.addAttribute("student" , studentService.getById(id));

        return "edit-student";
    }

    @PostMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable Integer id , @ModelAttribute("student") Student student)
    {
        Student existingStudent = studentService.getById(id);

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.saveStudent(existingStudent);

        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Integer id)
    {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
