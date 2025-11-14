package com.MacCourseRatingsBackend.MacCourseRatingsBackend.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    Optional<Course> findCourseByCourseCode(String courseCode);
}
