package com.example.a531j;

public class Chat {
    int profile;
    String fullname;

    public Chat(int profile, String fullname) {
        this.profile = profile;
        this.fullname = fullname;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
