package com.visaeurope.savethechildren.core;

/**
 * Created by dima on 06/08/2015.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class WelcomeWs {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to the Save The Children action portal";
    }



    @RequestMapping(method = RequestMethod.GET,value = "/object/{name}")
    ResponseEntity<?> back(@PathVariable String name){
        String responseBody =  String.format("Hello %s",name);
        return new ResponseEntity<Object>(responseBody,HttpStatus.ACCEPTED);
    }


    @RequestMapping(method = RequestMethod.PUT,value = "/report/{userid}")
    ResponseEntity<?> report(@PathVariable String userid, @RequestBody Report report){
        String responseBody =  String.format("Hello %s",userid);
        System.out.println("report = " + report.getExtraInfo());
        return new ResponseEntity<Object>(responseBody,HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/request/node/{name}")
    ResponseEntity<?> request(@PathVariable String name){
        String responseBody =  String.format("Hello %s",name);
        return new ResponseEntity<Object>(responseBody,HttpStatus.ACCEPTED);
    }




    public static void main(String[] args) throws Exception {
        SpringApplication.run(WelcomeWs.class, args);
    }
}
