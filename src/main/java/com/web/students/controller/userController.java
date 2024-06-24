package com.web.students.controller;


import com.web.students.DTO.SignupRequestDTO;
import com.web.students.models.User;
import com.web.students.repository.userRepo;
import com.web.students.services.userService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class userController {



private userRepo UserRepo;

private userService UserService;


@PostMapping("/signup")
    public String SignUp (@RequestBody SignupRequestDTO signupRequestDTO ){
    String Email;
    Email = signupRequestDTO.getEmail();
    String Password;
    Password =signupRequestDTO.getPassword();
    String UserName;
    UserName = signupRequestDTO.getUserName();
//  hash the password String ;

      UserService.signUp( Email,Password ,UserName);
      return "user Saved successfully";

    }



    @GetMapping("/users")
    public User getAllUsers (userRepo UserRepo){

        return (User) UserRepo.findAll();

    }

    @GetMapping("/users/{id}")
    public  User getUser (@PathVariable Long id){


    return null;
    }

    @PostMapping("users/create")
    public User  userSignUp(@RequestBody  SignupRequestDTO signupRequestDTO){
    String email =  signupRequestDTO.getEmail();
    String  password = signupRequestDTO.getPassword();
    String userName  =  signupRequestDTO.getUserName();


    return UserService.signUp(email , password , userName);

    }


//    login controller


}
