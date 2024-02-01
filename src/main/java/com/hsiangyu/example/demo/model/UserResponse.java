package com.hsiangyu.example.demo.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("USER_LIST")
    private List<User> userList;

    @JsonProperty("ERROR_MSG")
    private String errorMsg = "";

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "UserResponse [userList=[" + userList + "], errorMsg=[" + errorMsg + "]]";
    }

}
