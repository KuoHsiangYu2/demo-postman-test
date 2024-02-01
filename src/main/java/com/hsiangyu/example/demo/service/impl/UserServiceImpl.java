package com.hsiangyu.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hsiangyu.example.demo.model.User;
import com.hsiangyu.example.demo.model.UserResponse;
import com.hsiangyu.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResponse getUserDataByName(String searchName) {
        System.out.println("UserServiceImpl getUserDataByName in");
        UserResponse resultData = new UserResponse();
        resultData.setErrorMsg("");
        List<User> userListResult = new ArrayList<User>();
        List<User> originUserList = getInitData();
        for (User element : originUserList) {
            if (element.getUsername().contains(searchName)) {
                userListResult.add(element);
            }
        }
        resultData.setUserList(userListResult);
        if (userListResult.size() == 0) {
            resultData.setErrorMsg("no data found");
        }
        System.out.println("UserServiceImpl getUserDataByName out");
        return resultData;
    }

    @Override
    public UserResponse getUserDataByAge(int age) {
        System.out.println("UserServiceImpl getUserDataByAge in");
        UserResponse resultData = new UserResponse();
        resultData.setErrorMsg("");
        List<User> originUserList = getInitData();
        int finalAge = age;
        List<User> userListResult = originUserList.stream().filter((User user) -> {
            return (user.getAge() > finalAge);
        }).collect(Collectors.toCollection(ArrayList::new));
        resultData.setUserList(userListResult);
        if (userListResult.size() == 0) {
            resultData.setErrorMsg("no data found");
        }
        System.out.println("UserServiceImpl getUserDataByAge out");
        return resultData;
    }

    private List<User> getInitData() {
        List<User> originUserList = new ArrayList<User>();

        User user1 = new User();
        user1.setUsername("Simon");
        user1.setAge(35);
        originUserList.add(user1);

        User user2 = new User();
        user2.setUsername("Andymon");
        user2.setAge(10);
        originUserList.add(user2);

        User user3 = new User();
        user3.setUsername("kiwi");
        user3.setAge(41);
        originUserList.add(user3);

        return originUserList;
    }

}
