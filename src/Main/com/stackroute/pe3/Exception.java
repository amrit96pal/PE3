package com.stackroute.pe3;

/**
 *  Create a class with a main( ) that throws an object of class Exception inside a try block.
 *  a. Give the constructor for Exception a String argument.
 *  b. Catch the exception inside a catch clause and print the String argument.
 *  c. Add a finally clause and print a message to prove you were there.
 */

public class Exception extends Throwable {
    public Exception(String s) {
    }
    public static void main(String[] args) throws java.lang.Exception {
        try {
            if(true){
                throw new java.lang.Exception("This is inside the try block");
            }
        }
        catch(java.lang.Exception e){
            System.out.println(e.getMessage());
        }

    }

}
