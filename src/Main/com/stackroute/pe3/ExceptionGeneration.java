package com.stackroute.pe3;

/**
 *  Write a program that will generate exceptions of type NegativeArraySizeException, IndexOutOfBoundsException,
 *  NullPointerException. Record the catching of each exception by displaying the message stored in the exception
 *  object.
 */

public class ExceptionGeneration {
    private void negativeArrayException() {
        try {
            int array[] = new int[-1];
            NegativeArraySizeException n=new NegativeArraySizeException("The array size is minimum");
            throw n;
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
    private void arrayIndexException() {
        try {
            int array2[] = new int[2];
            array2[5]=5;
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    private void nullPointerException() {

        try {
            throw null;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        ExceptionGeneration ex= new ExceptionGeneration();
        ex.negativeArrayException();
        ex.arrayIndexException();
        ex.nullPointerException();
    }

}
