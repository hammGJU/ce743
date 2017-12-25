/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.alumni.alumniapp.beans;

import edu.gju.alumni.alumniapp.models.Student;
import edu.gju.alumni.alumniapp.services.StudentService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.inject.Inject;

/**
 *
 * @author hesham
 */
@Named(value = "studentBean")
@SessionScoped
public class StudentBean implements Serializable {

    private List<Student> studentList;
    private Student student;
    @Inject
    private StudentService studentService;

    public StudentBean() {
    }

    @PostConstruct
    @PostActivate
    public void populateStudents() {
        try {
            studentList = studentService.getAllStudents();
        } catch (SQLException ex) {
            Logger.getLogger(StudentBean.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
