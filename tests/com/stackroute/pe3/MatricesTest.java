package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatricesTest {
    Matrices mat;

    @Before
    public void setUp() throws Exception {
        mat= new Matrices();
    }

    @After
    public void tearDown() throws Exception {
        mat= null;
    }

    @Test
    public void addMatriceSuccess() {
        int row=2;
        int col=2;
        float[][] inp1={{1,2},{3,4}};
        float[][] inp2={{1,2},{3,4}};
        float[][] ans={{2,4},{6,8}};
        assertEquals(ans,mat.addMatrice(inp1,inp2,row,col));
    }

    @Test
    public void addMatriceFailure() {
        int row=2;
        int col=2;
        float[][] inp1={{1,2},{3,4}};
        float[][] inp2={{1,2},{3,4}};
        float[][] ans={{2,6},{6,8}};
        assertNotEquals(ans,mat.addMatrice(inp1,inp2,row,col));
    }
}