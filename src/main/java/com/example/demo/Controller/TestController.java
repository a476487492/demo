package com.example.demo.Controller;



import com.example.demo.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api")
public class TestController {

    @Autowired
     Person person;

    @RequestMapping(value = "test")
     public String getdeo(){
         return person.toString();
     }



}
