package com.MacCourseRatingsBackend.MacCourseRatingsBackend.rating;

import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, EmailCourseCodeKey> {

    List<Rating> findByEmailCourseCodeKeyCourseCode(String courseCode);

    List<Rating> findByEmailCourseCodeKeyEmail(String email);
}
