package com.web.students.services;

import com.web.students.models.Token;
import com.web.students.models.User;
import com.web.students.repository.tokenRepo;
import com.web.students.repository.userRepo;
import org.apache.hc.client5.http.auth.InvalidCredentialsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.UUID;

public class userService {
    private User user;

    private userRepo UserRepo ;

    private Token token;

    private tokenRepo TokenRepo;


    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder ;

//    public userService(BCryptPasswordEncoder bcryptPasswordEncoder) {
//        this.bcryptPasswordEncoder = bcryptPasswordEncoder;
//    }



    //    private userRepo userRepo;
    public User signUp(String name , String email , String password){
        Optional<User>  isExist = UserRepo.findByEmail(email);
        if(isExist.isPresent() ){
            System.out.println("user already exist");

        }

        user.setName(user.getName());
        user.setEmail(user.getEmail());
        user.setPassword( bcryptPasswordEncoder.encode(password));

       return  UserRepo.save(user);



    }

    public Token loginService (String email , String password )throws InvalidCredentialsException {
       Optional<User> isUser =UserRepo.findByEmail(email);
        if (isUser.isEmpty()) {
//            check if value returned is null
 throw new NullPointerException("isUser is not found");

        }


        public String getHashedPassword(){
            bcryptPasswordEncoder()
        }
// User model
;   User user = isUser.get();
      if (!bcryptPasswordEncoder.matches(password, user.getHashedPassword())) {
           throw new InvalidCredentialsException("please enter the correct field") ;
            }
            ;

        Token token = new Token() ;

         token.setUser(user);
         token.setExpiryDate(get1DayLaterDate());
         token.setValue(UUID.randomUUID().toString());
         return TokenRepo.save(token);

    }

    private Date get1DayLaterDate(){
        LocalDate currentDate=LocalDate.now().plusDays(1);
        return Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());


    }


    public User getUser (Long id){
            Optional<User> optionalUser = UserRepo.findById(id);
            if(optionalUser.isEmpty())
                try {
                    throw new FileNotFoundException("User not found");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }


        return null;
    }

}
