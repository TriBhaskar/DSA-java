package org.example.ARRAYS;

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,7,4,9,0,3};
        reverseArray(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
