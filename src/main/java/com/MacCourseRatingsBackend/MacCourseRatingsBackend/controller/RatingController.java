package com.MacCourseRatingsBackend.MacCourseRatingsBackend.controller;

import com.MacCourseRatingsBackend.MacCourseRatingsBackend.rating.Rating;
import com.MacCourseRatingsBackend.MacCourseRatingsBackend.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/ratings/")
public class RatingController {
    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService){
        this.ratingService = ratingService;
    }

    @GetMapping("/user/{user}")
    public List<Rating> getRatingByUser(@PathVariable String user){
        return ratingService.getRatingsByUser(user);
    }

    @GetMapping("/course/{courseCode}")
    public List<Rating> getRatingByCourseCode(@PathVariable String courseCode){
        return ratingService.getRatingsByCourseCode(courseCode);
    }
}
