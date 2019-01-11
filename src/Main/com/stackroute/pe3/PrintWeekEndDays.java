package com.stackroute.pe3;

/**
 * Write a java program to calculate first and last date of a week.
 *   Output:
 *   First Date of Week:             Mon 24/07/2017
 *   Last date of the week:          Sun 30/07/2017
 */

import java.text.*;

import java.util.Calendar;

public class PrintWeekEndDays {
    public Calendar firstDay(){
        Calendar calender=Calendar.getInstance();
        calender.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df= new SimpleDateFormat("EEE dd/MM/yyyy");
        return calender;
    }

    public Calendar lastDay(Calendar c){
        DateFormat dateformat= new SimpleDateFormat("EEE dd/MM/yyyy");
        for (int i=0;i<6;i++){
            c.add(Calendar.DATE,1);
        }
        return c;
    }
}
