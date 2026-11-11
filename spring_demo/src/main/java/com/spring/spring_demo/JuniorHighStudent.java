package com.spring.spring_demo;

//import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
public class JuniorHighStudent implements Student {
  
  @Override 
  public String getDailyAssignment() {
    return "Study coding";
  }
}
