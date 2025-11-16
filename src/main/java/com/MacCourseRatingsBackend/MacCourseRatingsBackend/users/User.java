package com.MacCourseRatingsBackend.MacCourseRatingsBackend.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String email;

    protected User(){

    }

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
