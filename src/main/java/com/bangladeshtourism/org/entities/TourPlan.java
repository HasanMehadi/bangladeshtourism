package com.bangladeshtourism.org.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TourPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String place;
    @Temporal(TemporalType.TIMESTAMP)
    public Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    public Date endDate;
    public float costPerPerson;
    public String phone;

    public TourPlan() {
    }

    public TourPlan(String place, Date startDate, Date endDate, float costPerPerson, String phone) {
        this.place = place;
        this.startDate = startDate;
        this.endDate = endDate;
        this.costPerPerson = costPerPerson;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getCostPerPerson() {
        return costPerPerson;
    }

    public void setCostPerPerson(float costPerPerson) {
        this.costPerPerson = costPerPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", costPerPerson=" + costPerPerson +
                ", phone='" + phone + '\'' +
                '}';
    }
}
