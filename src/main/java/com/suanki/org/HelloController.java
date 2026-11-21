package com.suanki.org;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // if you calling /hello then which methods will get called

   @GetMapping("hello")
  public String hello(){
      return "Hello World";
  }

  @GetMapping("bye")
  public String greetBye(){
       return "<h1>Hello Bye</h1>";
  }
 }
