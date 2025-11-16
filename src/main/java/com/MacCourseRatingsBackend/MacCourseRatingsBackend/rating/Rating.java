package com.MacCourseRatingsBackend.MacCourseRatingsBackend.rating;

import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {
    @EmbeddedId
    private EmailCourseCodeKey emailCourseCodeKey;
    @Column(name= "ease_rating")
    private Integer easeRating;
    @Column(name= "practicality_rating")
    private Integer practicalityRating;
    @Column(name= "enjoyability_rating")
    private Integer enjoyabilityRating;
    @Column(name= "overall_rating")
    private Integer overallRating;
    private String review;
    private String date;

    protected Rating(){

    }

    public Rating(EmailCourseCodeKey emailCourseCodeKey, Integer easeRating, Integer practicalityRating, Integer enjoyabilityRating, Integer overallRating, String review, String date) {
        this.emailCourseCodeKey = emailCourseCodeKey;
        this.easeRating = easeRating;
        this.practicalityRating = practicalityRating;
        this.enjoyabilityRating = enjoyabilityRating;
        this.overallRating = overallRating;
        this.review = review;
        this.date = date;
    }

    public EmailCourseCodeKey getEmailCourseCodeKey(){
        return emailCourseCodeKey;
    }

    public Integer getEaseRating() {
        return easeRating;
    }

    public Integer getPracticalityRating() {
        return practicalityRating;
    }

    public Integer getEnjoyabilityRating() {
        return enjoyabilityRating;
    }

    public Integer getOverallRating() {
        return overallRating;
    }

    public String getReview() {
        return review;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setOverallRating(Integer overallRating) {
        this.overallRating = overallRating;
    }

    public void setEnjoyabilityRating(Integer enjoyabilityRating) {
        this.enjoyabilityRating = enjoyabilityRating;
    }

    public void setPracticalityRating(Integer practicalityRating) {
        this.practicalityRating = practicalityRating;
    }

    public void setEaseRating(Integer easeRating) {
        this.easeRating = easeRating;
    }
}
