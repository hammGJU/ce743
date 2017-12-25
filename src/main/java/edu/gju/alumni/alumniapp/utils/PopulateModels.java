/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.alumni.alumniapp.utils;

import edu.gju.alumni.alumniapp.models.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hesham
 */
public class PopulateModels {

    public static Student populateStudent(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getString(StudentTableEnum.STUDENT_ID.toString()));
        student.setFirstName(rs.getString(StudentTableEnum.STUDENT_FIRST_NAME.toString()));
        student.setLastName(rs.getString(StudentTableEnum.STUDENT_LAST_NAME.toString()));
        student.setDateOfBirth(rs.getDate(StudentTableEnum.DATE_OF_BIRTH.toString()));
        student.setNationality(rs.getString(StudentTableEnum.NATIONALITY.toString()));
        student.setSchool(rs.getString(StudentTableEnum.SCHOOL_NAME.toString()));
        student.setDepartment(rs.getString(StudentTableEnum.DEPARTMENT_NAME.toString()));
        student.setDegree(rs.getString(StudentTableEnum.DEGREE_NAME.toString()));
        student.setGpa(rs.getDouble(StudentTableEnum.GPA.toString()));
        student.setGender(rs.getString(StudentTableEnum.GENDER_NAME.toString()));
        student.setStatusId(rs.getString(StudentTableEnum.STATUS_NAME.toString()));
        student.setYearsExperience(rs.getDouble(StudentTableEnum.YEARS_OF_EXPERIENCE.toString()));
        student.setFacebookLink(rs.getString(StudentTableEnum.FACEBOOK.toString()));
        student.setLinkedInLink(rs.getString(StudentTableEnum.LINKEDIN.toString()));
        student.setGradYear(rs.getString(StudentTableEnum.YEAR_NAME.toString()));
        student.setGradSemester(rs.getString(StudentTableEnum.SEMESTER_NAME.toString()));
        return student;
    }

}
