package com.stackroute.pe3;

/**
 * Write a program to set up an array of places, Loop round and remove the vowels. Display the new
 * words in console
 *  Input:
 *     India
 *     United States
 *     Germany
 *      Egypt
 *      czechoslovakia
 *
 * Output:
 *     Place Name without Vowels:0 Ind
 *     Place Name without Vowels:1 Untd Stts
 *     Place Name without Vowels:2 Grmny
 *     Place Name without Vowels:3 Egypt
 *     Place Name without Vowels:4 czchslvk
 */

import java.util.*;

public class RemoveVowels {

    public List<String> removeVowels(String[] inp){
        List<String> answer= new ArrayList<String>();
        if(inp==null){
            answer.add("Invalid null input");
            return answer;
        }
        if (inp[0].equals("")){
            answer.add("Invalid empty string input");
            return answer;
        }
        for(int i=0;i<inp.length;i++) {
            if(inp[i].length()==1) {

                if (inp[i].charAt(0) >= 48 && inp[i].charAt(0) <= 57) {
                    answer.add("Invalid integer input");
                    return answer;
                } else if (inp[i].charAt(0) >= 65 && inp[i].charAt(0) <= 123) {
                    answer.add("Invalid character input");
                    return answer;
                } else {
                    answer.add("Invalid special symbol input");
                    return answer;
                }
            }
            String temp=inp[i];
            char[] arr=temp.toCharArray();
            for(int j=0;j<arr.length;j++){
                if (arr[j] >= 48 && arr[j] <= 57) {
                    answer.add("Invalid integer input");
                    return answer;
                }
            }
        }
        for(int j=0;j<inp.length;j++){
            String temp=inp[j];
            String[] temp2=temp.split("a|e|i|o|u");
            String finalstr="";
            for(int k=0;k<temp2.length;k++){
                finalstr=finalstr.concat(temp2[k]);
            }
            inp[j]=finalstr;
        }
        for(int i=0;i<inp.length;i++){
            answer.add(inp[i]);
        }
        return answer;
    }
}
