package com.shahzad.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
   //     return "index";
    	System.out.println("IN  MainController->root()");
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(Model model) {
    	System.out.println("IN  MainController->login()");
        return "login";
    }
  
    
@GetMapping("/addstudent")
public String getHome(Model model) {
	System.out.println("homeMapping");
	return "create_student";
}

    @GetMapping("/user")
    public String userIndex() {
    	System.out.println("IN  MainController->userIndex()");
        return "user/index";
    }

    @ResponseBody
	@GetMapping("/logoutSuccess")
    public String logoutResponse()
    {
    	System.out.println("IN  MainController->logoutResponse()");
        return "Logged Out!!!!";
    }
   // @ResponseBody
    @RequestMapping("/home")
    public String home() {
     //   return "index";
    	System.out.println("IN  MainController->home()");
        return "home";
    }
//    @RequestMapping("/add_student")
//    public String add_student() {
//     //   return "index";
//    	System.out.println("IN  MainController->home()");
//        return "create_student";
//    }

}

