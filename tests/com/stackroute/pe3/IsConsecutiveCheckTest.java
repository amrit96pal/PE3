package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsConsecutiveCheckTest {
    IsConsecutiveCheck cons;

    @Before
    public void setUp() throws Exception {
        cons= new IsConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
        cons=null;
    }

    @Test
    public void sequenceCheckerSuccess() {
        String inp="1 2 3 4 5 6";
        assertEquals(true,cons.sequenceChecker(inp));
    }

    @Test
    public void sequenceCheckerFailure() {
        String inp="1 2 3 4 5 6 6";
        assertNotEquals(true,cons.sequenceChecker(inp));
    }
}