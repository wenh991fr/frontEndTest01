package com.testFrontEnd.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
 
@Controller
public class Index_Controller {
	
    @RequestMapping("/")
    String index(){
    	
        return "index";
    }
}

