package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks sd;
    private static final String input="33 55 77 99";
    ByteArrayInputStream in= new ByteArrayInputStream(input.getBytes());

    @Before
    public void setUp() throws Exception {
        sd= new StudentMarks();
        System.setIn(in);
    }

    @After
    public void tearDown() throws Exception {
        sd=null;
    }

    @Test
    public void checkMarksSuccess() {
        int inp=4;
        assertEquals(true,sd.checkMarks(inp));
    }
}