package com.web.students.controller;

import com.web.students.DTO.LoginRequestDTO;
import com.web.students.models.Token;
import com.web.students.models.StudentEntity;
import com.web.students.repository.studentRepo;
import com.web.students.repository.userRepo;
import com.web.students.services.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class studentController {

    @Autowired
    private studentRepo repo;

    private userRepo  userRepo;

    private user User;

    private loginService LoginService;

//    Constructors

    public studentController(loginService loginService) {
        LoginService = loginService;
    }
    public studentController(user user) {
        User = user;
    }

//    various routes and endpoints

    @GetMapping("/")
//    get all registered student
//    localhost:8080/api/v1/
    public List<StudentEntity> getAllStudents() {

        return (List<StudentEntity>) repo.findAll();
    }


    @PutMapping("/update/{id}")
    public String updateStudents (@PathVariable Lomg id){


    }


    //localhost:8080/api/v1/student/1
    @GetMapping("{studentId}")
    public StudentEntity getStudent(@PathVariable Long studentId) {
// this method is returning optional ,its like await , if it returns or not
        StudentEntity student;
        student = repo.findById(studentId).orElseThrow();

        return student;
    }






    //localhost:8080/api/v1/create
    @PostMapping("/create/students")
public String createStudent (@RequestBody StudentEntity student  ){
         repo.save(student);

         return "student created successfully";
}



// endpoints for users routes

    //localhost:8080/api/v1/signup/user
@PostMapping("/signup/user")
public StudentEntity signup(@RequestBody SignupDTO signupDTO){
        String name = signupDTO.getName();
        String email= signupDTO.getEmail();
        String password = signupDTO.getPassword();


        return StudentService.signup(name, email , password);

}


    //localhost:8080/api/v1/login/user
@PostMapping("/login/user")
    public Token login(@RequestBody LoginRequestDTO loginRequestDTO){
    Optional<userRepo>  optionUser =userRepo.
    try{

            String password = loginRequestDTO.getPassword();

            String email = loginRequestDTO.getEmail();
                    return User.loginService(email, password);

        }catch(Exception e){
            System.out.println(e);
        }

}

}