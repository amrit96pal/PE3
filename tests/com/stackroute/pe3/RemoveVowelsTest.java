package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels arr;

    @org.junit.Before
    public void setUp() throws Exception {
        arr= new RemoveVowels();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        arr=null;
    }

    @org.junit.Test
    public void removeVowelsSuccess() {
        String[] inp={"India","California","Pakistan"};
        List<String> ans= new ArrayList<String>(Arrays.asList("Ind","Clfrn","Pkstn"));
        assertEquals(ans,arr.removeVowels(inp));
    }

    @org.junit.Test
    public void removeVowelsFailure() {
        String[] inp={"India","California","Pakistan"};
        List<String> ans= new ArrayList<String>(Arrays.asList("India","Clfrn","Pkstn"));
        assertNotEquals(ans,arr.removeVowels(inp));
    }

    @org.junit.Test
    public void removeVowelsIntInput() {
        String[] inp={"1","2"};
        List<String> ans= new ArrayList<String>(Arrays.asList("Invalid integer input"));
        assertEquals(ans,arr.removeVowels(inp));
    }


    @org.junit.Test
    public void removeVowelsMixedInput() {
        String[] inp={"a2","2"};
        List<String> ans= new ArrayList<String>(Arrays.asList("Invalid integer input"));
        assertEquals(ans,arr.removeVowels(inp));
    }

    @org.junit.Test
    public void removeVowelsCharInput() {
        String[] inp={"a","b",};
        List<String> ans= new ArrayList<String>(Arrays.asList("Invalid character input"));
        assertEquals(ans,arr.removeVowels(inp));
    }

    @org.junit.Test
    public void removeVowelsSpecialSymbolInput() {
        String[] inp={"$","*"};
        List<String> ans= new ArrayList<String>(Arrays.asList("Invalid special symbol input"));
        assertEquals(ans,arr.removeVowels(inp));
    }

    @org.junit.Test
    public void removeVowelsNullInput() {
        String[] inp=null;
        List<String> ans= new ArrayList<String>();
        ans.add("Invalid null input");
        assertEquals(ans,arr.removeVowels(inp));
    }
    @org.junit.Test
    public void removeVowelsEmptyStringInput() {
        String[] inp={""};
        List<String> ans= new ArrayList<String>(Arrays.asList("Invalid empty string input"));
        assertEquals(ans,arr.removeVowels(inp));
    }



}