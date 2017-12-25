/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.alumni.alumniapp.utils;

/**
 *
 * @author hesham
 */
public enum StudentTableEnum {
    // Column Names
    STUDENT_ID("STUDENT_ID"),
    STUDENT_FIRST_NAME("STUDENT_FIRST_NAME"),
    STUDENT_LAST_NAME("STUDENT_LAST_NAME"),
    DATE_OF_BIRTH("DATE_OF_BIRTH"),
    NATIONALITY("NATIONALITY"),
    SCHOOL_ID("SCHOOL_ID"),
    SCHOOL_NAME("SCHOOL_NAME"),
    DEPARTMENT_ID("DEPARTMENT_ID"),
    DEPARTMENT_NAME("DEPARTMENT_NAME"),
    DEGREE_ID("DEGREE_ID"),
    DEGREE_NAME("DEGREE_NAME"),
    GPA("GPA"),
    GENDER_ID("GENDER_ID"),
    GENDER_NAME("GENDER_NAME"),
    STATUS_ID("STATUS_ID"),
    STATUS_NAME("STATUS_NAME"),
    YEARS_OF_EXPERIENCE("YEARS_OF_EXPERIENCE"),
    FACEBOOK("FACEBOOK"),
    LINKEDIN("LINKEDIN"),
    GRADUATION_YEAR_ID("GRADUATION_YEAR_ID"),
    YEAR_NAME("YEAR_NAME"),
    GRADUATION_SEMESTER_ID("GRADUATION_SEMESTER_ID"),
    SEMESTER_NAME("SEMESTER_NAME"),
    //Queries:
    GET_ALL_STUDENTS("select STUDENTS.STUDENT_ID, STUDENTS.STUDENT_FIRST_NAME,STUDENTS.STUDENT_LAST_NAME, STUDENTS.DATE_OF_BIRTH, "
            + "STUDENTS.NATIONALITY, STUDENTS.GPA, STUDENTS.YEARS_OF_EXPERIENCE, STUDENTS.FACEBOOK, STUDENTS.LINKEDIN, "
            + "STUDENT_STATUS.STATUS_NAME , DEEGREE.DEGREE_NAME, DEPARTMETS.DEPARTMENT_NAME,GENDER.GENDER_NAME, "
            + "GRADUATION_SEMESTER.SEMESTER_NAME,GRADUATION_YEAR.YEAR_NAME,SCHOOLS.SCHOOL_NAME "
            + "from students, STUDENT_STATUS , DEEGREE, DEPARTMETS , "
            + "GENDER,GRADUATION_SEMESTER,GRADUATION_YEAR,SCHOOLS "
            + "where students.status_id = student_status.status_id "
            + "and students.DEGREE_ID = DEEGREE.DEGREE_ID and students.DEPARTMENT_ID = DEPARTMETS.DEPARTMENT_ID "
            + "and students.GENDER_ID = GENDER.GENDER_ID and students.GRADUATION_SEMESTER_ID = GRADUATION_SEMESTER.GRADUATION_SEMESTER_ID "
            + "and students.GRADUATION_YEAR_ID = GRADUATION_YEAR.GRADUATION_YEAR_ID and students.SCHOOL_ID = SCHOOLS.SCHOOL_ID"),
    GET_STUDENT_BY_ID("SELECT * FROM STUDENTS WHERE STUDENT_ID=?"),
    EDIT_STUDENT("UPDATE STUDENTS SET STUDENT_FIRST_NAME=?, "
            + "STUDENT_LAST_NAME=?, "
            + "DATE_OF_BIRTH=?, "
            + "NATIONALITY=?, "
            + "SCHOOL_ID=?, "
            + "DEPARTMENT_ID=?, "
            + "DEGREE_ID=?, "
            + "GPA=?, "
            + "GENDER_ID=?, "
            + "STATUS_ID=?, "
            + "YEARS_OF_EXPERIENCE=?, "
            + "FACEBOOK=?, "
            + "LINKEDIN=?, "
            + "GRADUATION_YEAR_ID=?, "
            + "GRADUATION_SEMESTER_ID=?, "
            + "WHERE STUDENT_ID=?"),
    DELETE_STUDENT("DELETE FROM STUDENTS WHERE STUDENT_ID=?"),
    INSERT_STUDENT("INSERT INTO STUDENTS (STUDENT_ID, "
            + "STUDENT_FIRST_NAME, "
            + "STUDENT_LAST_NAME, "
            + "DATE_OF_BIRTH, "
            + "NATIONALITY, "
            + "SCHOOL_ID, "
            + "DEPARTMENT_ID, "
            + "DEGREE_ID, "
            + "GPA, "
            + "GENDER_ID, "
            + "STATUS_ID, "
            + "YEARS_OF_EXPERIENCE, "
            + "FACEBOOK, "
            + "LINKEDIN, "
            + "GRADUATION_YEAR_ID, "
            + "GRADUATION_SEMESTER_ID) VALUES ((SELECT MAX(STUDENT_ID) FROM STUDENTS)+1,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

    private String columnName;

    private StudentTableEnum(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        return columnName;
    }

}
