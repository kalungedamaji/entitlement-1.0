package com.learn.rest.entitlement10.configurations;

import com.learn.rest.entitlement10.entity.UserEntity;
import com.learn.rest.entitlement10.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;


@Component
public class PumpUserData implements CommandLineRunner {


    @Autowired


    private UserRepository userRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {

        UserEntity u1 = new UserEntity();
        u1.setUserName("dkalunge");
        u1.setPassword("password");
        userRepository.save(u1);

        UserEntity u2 = new UserEntity();
        u1.setUserName("bala");
        u1.setPassword("password");
        userRepository.save(u2);


    }
}
