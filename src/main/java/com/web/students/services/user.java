package com.web.students.services;

import com.web.students.models.Token;
import com.web.students.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

public class user {

    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder ;

//    private userRepo userRepo;
    public User signUp(String name , String email , String password){
        Optional<User> optionUser = User.findByEmail(email);
        if(optionUser.isPresent() ){
            System.out.println("user already exist");

        }
        User User =new User();
        User.setName(name);
        User.setEmail(email);
        User.setPassword(bcrytPasswordEncoder.encode(password));

        return userRepository.save(User);


    }

    public Token loginService (String email  , String password )throws InvalidCredentialsException{
        Optional<User> user = userRepo;
        if(user.isEmpty()){
            throw new InvalidCredentialsException();
        }

        return null;
    }

}
