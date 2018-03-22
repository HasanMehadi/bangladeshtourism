package com.bangladeshtourism.org.controllers;

import com.bangladeshtourism.org.entities.TourPlan;
import com.bangladeshtourism.org.services.TourPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Date;

@Controller
@RequestMapping("/tourplan")
public class TourPlanController {

    List<TourPlan> plans= null;

    @Autowired
    private TourPlanService planService;

    @GetMapping("/createTourPlan")
    public String createTourPlan(){
        return "tourPlan";
    }

    @PostMapping("/saveTourPlan")
    public String saveTourPlan(@RequestParam("place")String place, @RequestParam("startDay")Date startDay,@RequestParam("endDay") Date endDay,@RequestParam("price") float price,@RequestParam("phone")String phone){

        TourPlan tourPlan = new TourPlan(place,startDay,endDay,price,phone);
        tourPlan = planService.saveTourPlan(tourPlan);
        System.out.println(tourPlan);

        return "allTour";

    }

    @DeleteMapping("/tour/{id}")
    public String deleteTourPlan(@PathVariable int id,HttpServletRequest request){

        boolean ans = planService.deleteTourPackage(id);
        if(ans){
            plans =planService.getAllTourPlan();
            request.setAttribute("plans",plans);
            return "allTours";

        }
        return "allTours";
    }

    @GetMapping("/alltour")
    public String allTourPlans(HttpServletRequest request){

        plans = planService.getAllTourPlan();
        request.setAttribute("plans",plans);
        return "allTours";

    }
    @GetMapping("/tour/{id}")
    public String tourPlanDetails(@PathVariable int id,HttpServletRequest request){
        TourPlan tour = planService.getTourPlanById(id);
        request.setAttribute("tour",tour);
        return "tourDetails";
    }
}
