package com.learn.rest.entitlement10.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private long userId;
    private String  userName;
    private String password;
}
