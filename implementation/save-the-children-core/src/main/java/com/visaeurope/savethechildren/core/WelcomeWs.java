package com.visaeurope.savethechildren.core;

/**
 * Created by dima on 06/08/2015.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class WelcomeWs {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to the Save The Children action portal";
    }


    @RequestMapping("/sum")
    @ResponseBody
    String calculate(int... numbers) {
        Integer result = 0;
        for (int i : numbers) {
            result = result + i;
        }

        return String.valueOf(result);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/object/{name}")
    ResponseEntity<?> back(@PathVariable String name){
        String responseBody =  String.format("Hello %s",name);
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
