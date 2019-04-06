package com.eureka.eurekaprovider.controller;

import com.eureka.eurekaprovider.javaBean.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @RequestMapping("/person/{personId}")
    public Person getPerson(@PathVariable("personId") Integer id,
                            HttpServletRequest request){
        Person person = new Person(id, "zhangsan", 30,null);
        person.setMessage(request.getRequestURL().toString());
        return person;
    }
}
