package com.cognizant.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String studentName;

    @ManyToMany(fetch = FetchType.EAGER)

    @JoinTable(
            name = "student_course",

            joinColumns =
            @JoinColumn(name = "student_id"),

            inverseJoinColumns =
            @JoinColumn(name = "course_id")
    )

    private Set<Course> courses;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + "]";
    }
}