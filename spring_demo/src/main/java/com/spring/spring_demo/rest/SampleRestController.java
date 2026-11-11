package com.spring.spring_demo.rest;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;


@RestController
public class SampleRestController {

  //define a private field for the dependency
  private Student myStudent;
  //private Student anotherStudent;
  
  public SampleRestController(@Qualifier("ElementaryStudent")Student student){
      myStudent = student;
  }
  @GetMapping("/assignment")
  public String getAssignment() {
      return myStudent.getDailyAssignment();
  }
} 
/*
  public SampleRestController(@Qualifier("universityStudent")Student student,
                              @Qualifier("universityStudent")Student student_two){

      myStudent = student;
      anotherStudent = student_two;                          
  }

  @GetMapping("/check")
  public String checkScope(){
    return "myStudent===anotherStudent? " +(myStudent==anotherStudent);
  }


/*
  @Autowired 
  public void setStudent(@Qualifier ("universityStudent")Student student) {
    myStudent = student;
  }
/*
  //define a constructor for dependency injection
  public SampleRestController(Student theStudent) {
    myStudent = theStudent;
  }
  **
  @GetMapping ("/assignment")
  public String sayHello() {
    return myStudent.getDailyAssignment();
  }
*/