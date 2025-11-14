package com.MacCourseRatingsBackend.MacCourseRatingsBackend.controller;

import com.MacCourseRatingsBackend.MacCourseRatingsBackend.course.Course;
import com.MacCourseRatingsBackend.MacCourseRatingsBackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/courses/")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/{courseCode}")
    public Course getCourse(@PathVariable String courseCode){
        return courseService.getCourse(courseCode);
    }
}
