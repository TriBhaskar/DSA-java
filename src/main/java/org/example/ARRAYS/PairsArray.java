package org.example.ARRAYS;

public class PairsArray {
    public static void pairsArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6,7,4,9,0,3};
        pairsArray(arr);
    }
}
