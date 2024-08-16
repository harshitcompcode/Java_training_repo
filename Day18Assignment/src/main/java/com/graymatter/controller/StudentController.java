package com.graymatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @RequestMapping("/doLogin")
    public String doLogin() {
        return "login";
    }
    
    @RequestMapping("/addStudentForm")
    public String showAddStudentForm() {
        return "addStudentForm";
    }

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam String uname, @RequestParam String pwd) {
        ModelAndView mv;
        if ("admin".equals(uname) && "admin".equals(pwd)) {
            mv = new ModelAndView("welcome");
        } else {
            mv = new ModelAndView("login");
            mv.addObject("error", "Invalid credentials. Please try again.");
        }
        return mv;
    }

    @RequestMapping("/addStudent")
    public ModelAndView addStudent(@RequestParam String studentName, @RequestParam int studentId) {
        Student student = new Student(studentName, studentId);
        students.add(student);
        ModelAndView mv = new ModelAndView("student");
        mv.addObject("student", student);
        return mv;
    }

    @RequestMapping("/getAllStudentInfo")
    public ModelAndView getAllStudentInfo() {
        ModelAndView mv = new ModelAndView("allStudents");
        mv.addObject("students", students);
        System.out.println();
        return mv;
    }

    @RequestMapping("/getStudentById")
    public ModelAndView getStudentById(@RequestParam int studentId) {
        ModelAndView mv = new ModelAndView("student");
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                mv.addObject("student", student);
                return mv;
            }
        }
        mv.addObject("error", "Student not found");
        return mv;
    }

    @RequestMapping("/updateStudent")
    public ModelAndView updateStudent(@RequestParam int studentId, @RequestParam String studentName) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                student.setStudentName(studentName);
                ModelAndView mv = new ModelAndView("student");
                mv.addObject("student", student);
                return mv;
            }
        }
        ModelAndView mv = new ModelAndView("student");
        mv.addObject("error", "Student not found");
        return mv;
    }

    @RequestMapping("/deleteStudent")
    public ModelAndView deleteStudent(@RequestParam int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
        ModelAndView mv = new ModelAndView("allStudents");
        mv.addObject("students", students);
        return mv;
    }
}
