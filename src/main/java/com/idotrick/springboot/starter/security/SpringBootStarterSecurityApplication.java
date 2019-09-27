package com.idotrick.springboot.starter.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringBootStarterSecurityApplication {
  @GetMapping("/home")
  @ResponseBody
  public String home() {
    return "Welcome to home..!!";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootStarterSecurityApplication.class, args);
  }

}
