package com.learn.rest.entitlement10.businessobject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {
    private String userName;
    private char[] pssword;
}
