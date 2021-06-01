/*
 * Copyright (c) 2021. This is a property of ROU Technology and you should not in anyway do anything illegal with it or to it as define by ROU Technology. If you would like to do anything with it kindly contact us at support@routechnology.tech
 */

package com.routechnology.noteapp.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}