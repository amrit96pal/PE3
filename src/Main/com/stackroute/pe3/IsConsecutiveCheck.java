package com.stackroute.pe3;

/**
 * Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
 * assume the digits are a string and use split()
 *  Input: 98,96,95,94,93
 *  Output: 98,96,95,94,93 non consecutive numbers
 *
 *  Input: 54,53,52,51,50,49,48
 *  Output : 54,53,52,51,50,49,48 are consecutive numbers
 *
 *  Input: 1,2,3,4,5,6,6
 *  Output: 1,2,3,4,5,6,6 non consecutive numbers
 */

public class IsConsecutiveCheck {

    public boolean sequenceChecker(String inp){
        String[] arr=inp.split(" ");
        boolean answer=true;
        int first=0;
        int second=0;
        try {
            if(arr.length<2){
                java.lang.Exception e= new java.lang.Exception("less numbers entered by user");
                throw e;
            }
            first=Integer.parseInt(arr[0]);
            second=Integer.parseInt(arr[1]);
            if(second-first==1){
                for(int i=0;i<arr.length-1;i++){
                    if(Integer.parseInt(arr[i+1])-Integer.parseInt(arr[i])==1){
                        answer=true;
                    }
                    else {
                        answer=false;
                        break;
                    }
                }
            }
            else if(first-second==1){
                for(int i=0;i<arr.length-1;i++){
                    if(Integer.parseInt(arr[i])-Integer.parseInt(arr[i+1])==1){
                        answer=true;
                    }
                    else {
                        answer=false;
                        break;
                    }
                }
            }
            else{
                answer=false;
            }
        }catch (java.lang.Exception e){
            System.out.println(e.getMessage());
        }
        return answer;
    }
}
