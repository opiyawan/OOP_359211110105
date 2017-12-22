package ooplab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myArray2D {
    public static void main(String[] args) throws IOException {
//        Array 2D
        int[][] number = new int[2][3];
        number = InputData(number);
        ShowData (number);
    }//main

    private static void ShowData(int[][] number) {
        System.out.println("Data in array 2D:");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++)
                System.out.print(number[i][j]+" ");
        }
    }
    private static int[][] InputData(int[][] number) throws IOException {
        BufferedReader reader = new BufferedReader(
    new InputStreamReader(System.in));
        System.out.println("Enter an inger: ");
        for (int i = 0; i < number.length; i++) {
            for (int j=0;j < number[i].length; j++) {
                System.out.print("number[" + i + "][" + j + "]:");
                number[i][j] = reader.readLine();
            }
        }
        return number;
    }//class


