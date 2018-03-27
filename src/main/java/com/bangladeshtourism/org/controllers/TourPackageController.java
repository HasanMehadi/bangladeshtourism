package com.bangladeshtourism.org.controllers;

import com.bangladeshtourism.org.entities.TourPackage;
import com.bangladeshtourism.org.services.TourPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tourpackage")
public class TourPackageController {

    List<TourPackage> plans= null;

    @Autowired
    private TourPackageService packageService;

    @GetMapping("/createTourPackage")
    public String createTourPackage(){
        return "tourPlan";
    }

    @PostMapping("/saveTourPackage")
    public String saveTourPackage(@ModelAttribute TourPackage tourPackage){

        TourPackage tPackage = packageService.saveTourPackage(tourPackage);
        System.out.println(tPackage);

        return "allTour";

    }

    @DeleteMapping("/tour/{id}")
    public String deleteTourPlan(@PathVariable int id,Model model){

        boolean ans = packageService.deleteTourPackageById(id);
        if(ans){
            plans =packageService.getAllTourPackages();
            model.addAttribute("plans",plans);
            return "allTours";

        }
        return "allTours";
    }

    @GetMapping("/alltour")
    public String allTourPlans(Model model){

        plans =packageService.getAllTourPackages();
        model.addAttribute("plans",plans);
        return "allTours";

    }
    @GetMapping("/tour/{id}")
    public String tourPlanDetails(@PathVariable int id,Model model){
        TourPackage tour = packageService.getTourPackageById(id);
        model.addAttribute("tour",tour);
        return "tourDetails";
    }
}
