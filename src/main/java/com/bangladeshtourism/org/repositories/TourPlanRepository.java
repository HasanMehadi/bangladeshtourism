package com.bangladeshtourism.org.repositories;

import com.bangladeshtourism.org.entities.TourPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface TourPlanRepository extends JpaRepository<TourPlan, Integer> {

    TourPlan getTourPlanByStartDateAndEndDate(Date startDay,Date endDay);
}
