package org.example.ARRAYS;

public class Example1 {
    public static void findLargest(int arr[]){
        int largest=0;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("Largest no from array is :"+largest);
    }
    public static void changeNumber(int arr[]){
        arr[0]=2;
    }
    public static void main(String[] args) {
        int marks[] = {5,0,9,4,6,7,67};
        findLargest(marks);
//        System.out.println(marks[0]);
//        Example1.changeNumber(marks);
//        System.out.println(marks[0]);
    }
}
