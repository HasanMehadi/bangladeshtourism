package com.bangladeshtourism.org.services;

import com.bangladeshtourism.org.entities.TourPlan;
import com.bangladeshtourism.org.repositories.TourPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TourPlanService {

    @Autowired
    private TourPlanRepository planRepository;

    public TourPlan saveTourPlan(TourPlan tourPlan){
        TourPlan plan = planRepository.save(tourPlan);
        return plan;
    }

    public TourPlan updateTourPlan(TourPlan tourPlan){
        TourPlan plan = planRepository.save(tourPlan);
        return plan;
    }

    public TourPlan getTourPlanByDate(Date startDay,Date endDay){
        TourPlan plan = planRepository.getTourPlanByStartDateAndEndDate(startDay,endDay);
        return plan;
    }
    public TourPlan getTourPlanById(int id){
        TourPlan plan = planRepository.getOne(id);
        return plan;
    }

    public Boolean deleteTourPackage(int id){
        try{
            planRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public List<TourPlan> getAllTourPlan(){
        return  planRepository.findAll();

    }

}
