package com.example.test.models;

import com.google.firebase.database.ServerValue;

public class Post {

    private String postKey;
    private String title;
    private String description;
    private String picture;
    private String userid;
    private String userphoto;
    private Object timestamp;

    public Post(String title, String description, String picture, String userid, String userphoto){

        this.title=title;
        this.description=description;
        this.picture=picture;
        this.userid=userid;
        this.userphoto=userphoto;
        this.timestamp= ServerValue.TIMESTAMP;

    }

    public Post() {

    }

    public String getPostKey() {
        return postKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserid() {
        return userid;
    }

    public String getUserphoto() {
        return userphoto;
    }

    public Object getTimestamp() {
        return timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }
}
