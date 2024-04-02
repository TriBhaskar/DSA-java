package org.example.ARRAYS;

import java.util.Scanner;

public class Matrices {
    public static void search(int matrix[][], int key){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Found "+key+" at index "+i+" row "+j+" colm");
                    return;
                }
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Enter your value for "+i+"st row");
            for (int j=0; j<3; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<3; i++){

            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,3);
    }
}
