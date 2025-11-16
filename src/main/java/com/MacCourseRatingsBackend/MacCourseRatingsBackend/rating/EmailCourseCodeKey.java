package com.MacCourseRatingsBackend.MacCourseRatingsBackend.rating;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmailCourseCodeKey implements Serializable {
    @Column(name= "email")
    private String email;
    @Column(name= "course_code")
    private String courseCode;

    protected EmailCourseCodeKey() {}

    public EmailCourseCodeKey(String email, String courseCode) {
        this.email = email;
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailCourseCodeKey that)) return false;
        return Objects.equals(email, that.email)
                && Objects.equals(courseCode, that.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, courseCode);
    }

}
