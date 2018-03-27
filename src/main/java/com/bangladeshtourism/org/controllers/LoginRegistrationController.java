package com.bangladeshtourism.org.controllers;

import com.bangladeshtourism.org.entities.TourPackage;
import com.bangladeshtourism.org.entities.TourPlan;
import com.bangladeshtourism.org.entities.Users;
import com.bangladeshtourism.org.services.TourPackageService;
import com.bangladeshtourism.org.services.TourPlanService;
import com.bangladeshtourism.org.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/bangladeshTourism")
public class LoginRegistrationController {

   @Autowired
   private UsersService service;

   @Autowired
   private TourPlanService tourPlanService;

   @Autowired
   private TourPackageService tourPackageService;

   @GetMapping("/createUser")
   public String createUser(){
       return "registration";
   }

   @PostMapping("/saveUser")
   public String saveUser(@ModelAttribute Users user){
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
      List<TourPlan> planList = tourPlanService.getAllTourPlan();
      List<TourPackage> tourPackages = tourPackageService.getAllTourPackages();
      model.addAttribute("planList",planList);
      model.addAttribute("tourPackages",tourPackages);
      if(users!=null){

         return "home";
      }else {
         return "login";
      }
   }

}
