package com.stackroute.pe3;

/**
 * Create a class called StudentMarks, which prompts user for the number of students, reads it from the
 * keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the grades of
 * each of the students and saves them in an int array called stuGrades. Your program shall check that the
 * grade is between 0 and 100 else has to trow an error message.
 */

import java.util.*;

public class
StudentMarks {

    public boolean checkMarks(int student) throws OutOfMemoryError{
        int array[]=new int[student];
        Boolean answer=true;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            try {
                array[i]=sc.nextInt();
                if(array[i]>100 || array[i] <0){
                    OutOfMemoryError ob=new OutOfMemoryError("ERROR! Grades should be in range of 0 to 100");
                    answer=false;
                    throw ob;
                }
            }catch (OutOfMemoryError e){
                System.out.println(e.getMessage());
            }
        }
        return answer;
    }
}
