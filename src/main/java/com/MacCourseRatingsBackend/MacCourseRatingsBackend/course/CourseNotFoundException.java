package com.MacCourseRatingsBackend.MacCourseRatingsBackend.course;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String code) {
        super("Course not found: " + code);
    }
}
