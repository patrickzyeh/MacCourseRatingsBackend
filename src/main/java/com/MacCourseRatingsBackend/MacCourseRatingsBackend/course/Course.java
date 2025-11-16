package com.MacCourseRatingsBackend.MacCourseRatingsBackend.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @Column(name= "course_code", unique = true)
    private String courseCode;
    @Column(name= "course_title")
    private String courseTitle;

    protected Course() {

    }

    public Course(String course_code, String course_title) {
        this.courseCode = course_code;
        this.courseTitle = course_title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}
