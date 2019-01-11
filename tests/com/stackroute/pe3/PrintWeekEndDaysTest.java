package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.*;

public class PrintWeekEndDaysTest {

    PrintWeekEndDays week;

    @Before
    public void setUp() throws Exception {
        week= new PrintWeekEndDays();
    }

    @After
    public void tearDown() throws Exception {
        week= null;
    }

    @Test
    public void firstDayLastdaySuccess() {
        DateFormat df= new SimpleDateFormat("EEE dd/MM/yyyy");
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        Calendar c1=c;
        assertEquals(c,week.firstDay());

        for (int i=0;i<6;i++){
            c.add(Calendar.DATE,1);
        }
        assertEquals(c,week.lastDay(c1));
    }

    @Test
    public void firstDayLastDayFailure() {
        DateFormat df= new SimpleDateFormat("EEE dd/MM/yyyy");
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.THURSDAY);
        Calendar c2=c;
        assertNotEquals(c,week.firstDay());
        assertNotEquals(c,Calendar.TUESDAY);
    }



}