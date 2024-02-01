package com.hsiangyu.example.demo.service;

import com.hsiangyu.example.demo.model.UserResponse;

public interface UserService {

    /* 只要有包含 searchName 的字，就把該名 User資料秀出來。 */
    public abstract UserResponse getUserDataByName(String searchName);

    /* 只要年齡大於 searchAge，就把該名 User資料秀出來。 */
    public abstract UserResponse getUserDataByAge(int searchAge);
}
