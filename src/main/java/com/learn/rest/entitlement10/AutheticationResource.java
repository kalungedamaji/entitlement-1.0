package com.learn.rest.entitlement10;

import com.learn.rest.entitlement10.service.AutenticationService;
import com.learn.rest.entitlement10.businessobject.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authentication/v1")
public class AutheticationResource {
    @Autowired
    private AutenticationService autenticationService;

    @GetMapping(path="/users")
    public List<User> getUsers(){
       return autenticationService.getUsers();
    }

    @PostMapping(path = "/login")
    public ResponseEntity login(@RequestBody User user) {
       if(autenticationService.login(user)) {
           return ResponseEntity.status(HttpStatus.OK).build();
       }else{
           return ResponseEntity.noContent().build();
       }
    }

    @PostMapping(path = "/logout")
    public ResponseEntity logout(@RequestBody User user) {
        return ResponseEntity.noContent().build();
    }

}
