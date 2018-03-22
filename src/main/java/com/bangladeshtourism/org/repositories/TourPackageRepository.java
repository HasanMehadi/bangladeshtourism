package com.bangladeshtourism.org.repositories;

import com.bangladeshtourism.org.entities.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface TourPackageRepository extends JpaRepository<TourPackage,Integer> {

    TourPackage getTourPackageByStartDayAndEndDay(Date startDay,Date endDay);
}
