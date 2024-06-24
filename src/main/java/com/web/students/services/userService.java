package com.web.students.services;

import com.web.students.models.Token;
import com.web.students.models.User;
import com.web.students.repository.userRepo;
import org.apache.hc.client5.http.auth.InvalidCredentialsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

public class userService {
    private User user;

    private userRepo UserRepo ;



    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder ;

//    public userService(BCryptPasswordEncoder bcryptPasswordEncoder) {
//        this.bcryptPasswordEncoder = bcryptPasswordEncoder;
//    }



    //    private userRepo userRepo;
    public User signUp(String name , String email , String password){
         optionUser = UserRepo.findByEmail(email);
        if(optionUser.isPresent() ){
            System.out.println("user already exist");

        }

        user.setName(user.getName());
        user.setEmail(user.getEmail());
        user.setPassword( bcryptPasswordEncoder.encode(password));

        UserRepo.save(user);


    }

    public Token loginService (String email , String password )throws InvalidCredentialsException {
       Optional<User> isUser =UserRepo.findByEmail(email);
        if (isUser.isEmpty()) {
//            check if value returned is null
 throw new NullPointerException("isUser is not found");

        }
// User model
;   User user = isUser.get();
      if (!bcryptPasswordEncoder.matches(password, user.getHashedPassword())) {
                return null;
            }
            ;
       else {
            throw new InvalidCredentialsException();
        }


    }


    public User getUser (){
        Optional<User> optionalUser =
        return null;
    }

}
