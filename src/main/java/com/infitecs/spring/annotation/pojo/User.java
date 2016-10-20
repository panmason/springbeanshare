package com.infitecs.spring.annotation.pojo;

/**
 * @author peter pan on 10/20/2016.
 */
public class User {

    private String id;

    private String username;

    private String address;

    public User(String id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\tusername:" + username + "\taddress:" + address;
    }
}
