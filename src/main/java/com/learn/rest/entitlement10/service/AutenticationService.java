package com.learn.rest.entitlement10.service;

import com.learn.rest.entitlement10.businessobject.User;
import com.learn.rest.entitlement10.entity.UserEntity;
import com.learn.rest.entitlement10.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutenticationService {
    @Autowired
    private UserRepository userRepository;

    public boolean login(User user) {
        Iterable<UserEntity> userEntityIterable = userRepository.findAll();
        for (UserEntity userEntity : userEntityIterable) {
            if (userEntity.getUserName().equalsIgnoreCase(user.getUserName())) {
                return true;
            }

        }
        return false;
    }

    public void logout(User user) {

    }

    public List<User> getUsers() {

        Iterable<UserEntity> userEntityIterable= userRepository.findAll();
          List<User>  userList=new ArrayList<>();
        userEntityIterable.forEach( user1 -> userList.add(convertToSuer(user1)));
        return userList;
    }

    private User convertToSuer(UserEntity user1) {
        User  user=new User();
        user.setUserName(user1.getUserName());
        return user;
    }
}
