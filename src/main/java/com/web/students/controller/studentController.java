package com.web.students.controller;
import com.web.students.models.StudentEntity;
import com.web.students.repository.studentRepo;
import com.web.students.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import java.awt.*;

@RestController
@RequestMapping("/api/v1")
public class studentController {

    @Autowired
    private studentRepo repo;

    private userRepo  UserRepo;

//    public studentController(userRepo userRepo) {
//        UserRepo = userRepo;
//    }


//    private loginService LoginService;

//    Constructors

//

//    various routes and endpoints

    @GetMapping("/")
    public List<StudentEntity> getAllStudents() {

        List<StudentEntity> students;
          students = repo.findAll();
          return students;
    }


//    @PutMapping("/update/{id}")
//    public String updateStudents (@PathVariable Long id){
// return  updateStudents;
//
//    }


    //localhost:8080/api/v1/student/1
//    @GetMapping("{studentId}")
//    public StudentEntity getStudent(@PathVariable Long studentId) {
//// this method is returning optional ,its like await , if it returns or not
//        StudentEntity student;
//        student = repo.findById(studentId).orElseThrow();
//
//        return student;
//    }






    //localhost:8080/api/v1/create
//    @PostMapping("/create/students")
//public String createStudent (@RequestBody StudentEntity student  ){
//         repo.save(student);
//
//         return "student created successfully";
//}
//


// endpoints for users routes

    //localhost:8080/api/v1/signup/user
//@PostMapping("/signup/user")
//public StudentEntity signup(@RequestBody SignupDTO signupDTO){
//        String name = signupDTO.getName();
//        String email= signupDTO.getEmail();
//        String password = signupDTO.getPassword();
//
//
//        return StudentService.signup(name, email , password);
//
//}


    //localhost:8080/api/v1/login/user
//@PostMapping("/login/user")
//    public Token login(@RequestBody LoginRequestDTO loginRequestDTO){
//    Optional<userRepo>  optionUser =
//    try{
//
//            String password = loginRequestDTO.getPassword();
//
//            String email = loginRequestDTO.getEmail();
//                    return User.loginService(email, password);
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//
//}
//
}