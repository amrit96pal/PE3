package com.stackroute.pe3;

/**
 * Write a program to create a ChessBoard pattern with the help of multidimensional array, where
 * WWrepresents white color and BB represents Black color.
 *  Output:
 *  My Chess Board
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 */

public class PrintChessBoard {
    public void printBoard(){
        String[][] chess= new String[8][8];
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if(i%2==0){
                    if(j%2==0){
                        chess[i][j]="WW|";
                    }
                    else {
                        chess[i][j]="BB|";
                    }
                }
                else{
                    if(j%2==0){
                        chess[i][j]="BB|";
                    }
                    else {
                        chess[i][j]="WW|";
                    }
                }
            }
        }
        for (int k=0;k<8;k++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chess[k][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        PrintChessBoard ch= new PrintChessBoard();
        ch.printBoard();
    }

}
