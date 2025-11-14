package com.MacCourseRatingsBackend.MacCourseRatingsBackend.service;

import com.MacCourseRatingsBackend.MacCourseRatingsBackend.course.Course;
import com.MacCourseRatingsBackend.MacCourseRatingsBackend.course.CourseNotFoundException;
import com.MacCourseRatingsBackend.MacCourseRatingsBackend.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    public Course getCourse(String courseCode){
        return courseRepository.findCourseByCourseCode(courseCode).orElseThrow(() -> new CourseNotFoundException(courseCode));
    }
}
