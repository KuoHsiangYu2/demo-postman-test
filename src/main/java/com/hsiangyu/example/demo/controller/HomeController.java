package com.hsiangyu.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsiangyu.example.demo.model.SearchObj;
import com.hsiangyu.example.demo.model.SearchType;
import com.hsiangyu.example.demo.model.UserResponse;
import com.hsiangyu.example.demo.service.UserService;

@RestController
public class HomeController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping("/")
    public Map<String, String> hello() {
        System.out.println("HomeController Mapping [/]");
        Map<String, String> mapMessage = new LinkedHashMap<String, String>();
        mapMessage.put("01_say", "hello");
        mapMessage.put("02_simon", "hello Java");
        mapMessage.put("03_測試鍵值", "測試內容");
        System.out.printf("mapMessage {%s%n}", mapMessage.toString());
        return mapMessage;
    }

    @GetMapping("/searchUserData")
    public UserResponse searchUserData(@RequestBody SearchObj request) {
        System.out.println("HomeController Mapping [/searchUserData]");
        UserResponse result = null;
        if (request.getSearchType() == SearchType.SEARCH_NAME) {
            // 依據名字搜尋User.
            result = userServiceImpl.getUserDataByName(request.getSearchName());
        } else if (request.getSearchType() == SearchType.SEARCH_AGE) {
            // 依據年齡搜尋User.
            result = userServiceImpl.getUserDataByAge(request.getSearchAge());
        } else {
            System.out.println("HomeController Mapping [/searchUserData] UserType error!");
            throw new RuntimeException("UserType error!");
        }
        return result;
    }
}
