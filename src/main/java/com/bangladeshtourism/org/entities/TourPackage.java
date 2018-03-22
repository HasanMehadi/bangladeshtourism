package com.bangladeshtourism.org.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TourPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String place1;
    public int dayPlace1;
    public String place2;
    public int dayPlace2;
    public String place3;
    public int dayPlace3;
    @Temporal(TemporalType.TIMESTAMP)
    public Date startDay;
    @Temporal(TemporalType.TIMESTAMP)
    public Date endDay;


    public TourPackage() {
    }

    public TourPackage(String place1, int dayPlace1, String place2, int dayPlace2, String place3, int dayPlace3, Date startDay, Date endDay) {
        this.place1 = place1;
        this.dayPlace1 = dayPlace1;
        this.place2 = place2;
        this.dayPlace2 = dayPlace2;
        this.place3 = place3;
        this.dayPlace3 = dayPlace3;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace1() {
        return place1;
    }

    public void setPlace1(String place1) {
        this.place1 = place1;
    }

    public int getDayPlace1() {
        return dayPlace1;
    }

    public void setDayPlace1(int dayPlace1) {
        this.dayPlace1 = dayPlace1;
    }

    public String getPlace2() {
        return place2;
    }

    public void setPlace2(String place2) {
        this.place2 = place2;
    }

    public int getDayPlace2() {
        return dayPlace2;
    }

    public void setDayPlace2(int dayPlace2) {
        this.dayPlace2 = dayPlace2;
    }

    public String getPlace3() {
        return place3;
    }

    public void setPlace3(String place3) {
        this.place3 = place3;
    }

    public int getDayPlace3() {
        return dayPlace3;
    }

    public void setDayPlace3(int dayPlace3) {
        this.dayPlace3 = dayPlace3;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "id=" + id +
                ", place1='" + place1 + '\'' +
                ", dayPlace1=" + dayPlace1 +
                ", place2='" + place2 + '\'' +
                ", dayPlace2=" + dayPlace2 +
                ", place3='" + place3 + '\'' +
                ", dayPlace3=" + dayPlace3 +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                '}';
    }
}
