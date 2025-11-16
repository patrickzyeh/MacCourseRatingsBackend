package com.MacCourseRatingsBackend.MacCourseRatingsBackend.service;

import com.MacCourseRatingsBackend.MacCourseRatingsBackend.rating.Rating;
import com.MacCourseRatingsBackend.MacCourseRatingsBackend.rating.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository){
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> getRatingsByCourseCode(String courseCode){
        return ratingRepository.findByEmailCourseCodeKeyCourseCode(courseCode);
    }

    public List<Rating> getRatingsByUser(String user){
        return ratingRepository.findByEmailCourseCodeKeyEmail(user);
    }

}
