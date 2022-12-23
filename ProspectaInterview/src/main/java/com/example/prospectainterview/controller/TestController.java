package com.example.prospectainterview.controller;


import com.example.prospectainterview.model.Bean;
import com.example.prospectainterview.model.*;
import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.ArrayList;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/entries")
    public ResponseEntity<objec> getCategory(@RequestParam String category) {

        String url = "https://api.publicapis.org/entries?category=";
        Object obj = restTemplate.getForObject(url+category, Object.class);
//        System.out.println(obj.toString());
//        ResponseFromURL categories = restTemplate.getForObject(url+category, ResponseFromURL.class);
//        System.out.println(categories.getEntries());
//        List<Bean> output= new ArrayList<>();
//        List<Entries> entriesList = categories.getEntries();
//
//        for(Entries ent : entriesList) {
//            System.out.println(ent);
//            Bean bean = new Bean();
//            bean.setTitle(ent.getAPI());
//            bean.setDescription(ent.getDescription());
//            output.add(bean);
//        }

        

        return new ResponseEntity<>(obj, HttpStatus.OK);
    }




    //Encryption
    //Be cryptic. Nothing should be in the clear for internal or external communications.
    // Encryption will convert your information into code.
    // This will make it much more difficult for sensitive data to end up in the wrong hands.

    //API Gateway (API Management)
    //Gateway to heaven. All the above mechanisms are long to implement and maintain.
    // Instead of reinventing the wheel, you should opt for a mature and high-performing API Management solution with all these options to save your money, time, and resources and increase your time to market.
    // An API Gateway will help you secure, control, and monitor your traffic.

    //loggin
    //Continually monitoring your API and what it’s up to can pay off.
    // Be vigilant like that overprotective parent who wants to know everything about the people around their son or daughter.

    //Authentication
    // means something (or someone) is who they say they are. In the digital world,
    // authentication is the process of verifying a user’s identity.
    // It essentially pulls off the mask of anyone who wants to see your information.
}
