package com.bangladeshtourism.org.controllers;

import com.bangladeshtourism.org.entities.Users;
import com.bangladeshtourism.org.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/bangladeshTourism")
public class LoginRegistrationController {

   @Autowired
   private UsersService service;

   @GetMapping("/createUser")
   public String createUser(){
       return "registration";
   }

   @PostMapping("/saveUser")
   public String saveUser(/**@RequestParam("fname") String fname,@RequestParam("lname")String lname,@RequestParam("email") String email,@RequestParam("phone") String phone,@RequestParam("username")String username,@RequestParam("password")String password*/ @ModelAttribute Users user){
      Users users = user; //new Users(fname,lname,email,phone,username,password);
      service.saveUsers(users);
      return "login";
   }

   @GetMapping("/login")
   public String getUserIdAndPassword(){
      return "login";
   }

   @PostMapping("/authUser")
   public String authUser(@RequestParam("username")String username,@RequestParam("password") String password,Model model){
      Users users = service.getAuthUser(username,password);
      model.addAttribute("users",users);
      if(users!=null){

         return "home";
      }else {
         return "login";
      }
   }

}
