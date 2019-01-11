package com.stackroute.pe3;

/**
 *  Write a program to compute the addition of two matrix, Read the number of rows and columns as input,
 *  also the values of each matrix
 *   Output:
 *   Input number of rows of matrix: 3
 *   Input number of columns of matrix: 2
 *   Input elements of first matrix: 1 2 3 4 5 6
 *   Input the elements of second matrix: 9 8 7 6 5 4
 *   Sum of the matrices:-
 *                      10        10
 *                      10        10
 *                      10        10
 */

import java.util.Scanner;
public class Matrices {

    public float[][] addMatrice(float[][] matrix1,float[][]matrix2,int row,int col){
        float [][] matrix3 = new float[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }
}