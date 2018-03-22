package com.bangladeshtourism.org.services;

import com.bangladeshtourism.org.entities.TourPackage;
import com.bangladeshtourism.org.repositories.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class TourPackageService {

    @Autowired
    private TourPackageRepository packageRepository;

    public TourPackage saveTourPackage(TourPackage tourPackage){
        TourPackage tpackage = packageRepository.save(tourPackage);
        return tpackage;
    }

    public TourPackage updateTourPackage(TourPackage tourPackage){
        TourPackage tpackage = packageRepository.save(tourPackage);
        return tpackage;
    }

    public TourPackage getTourPackageByDate(Date startDay,Date endDay){
        TourPackage tourPackage = packageRepository.getTourPackageByStartDayAndEndDay(startDay,endDay);
        return tourPackage;
    }

    public Boolean deleteTourPackageById(int id){
        try{
            packageRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
