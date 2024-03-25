package org.example.ARRAYS;

public class SearchAlgorithm {
    public static void linearSearch(int arr[], int key){
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]== key){
                index=i;
            }
        }
        System.out.println("key found at location"+index);
    }
    public static int binarySearch(int[] arr, int key){
        int start = 0, end = arr.length-1;
        while (start<= end){
            int mid = (start + end)/2;

            //comparison
            if(arr[mid]== key){
                System.out.println("key found at index :"+mid);
                return mid;
            }
            if(arr[mid]<key){
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }
        System.out.println("Key not found");
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2,6,7,4,9,0,3};
        int[] arr1 = {2,4,6,7,9,10,12,15,18,20};
        int key = 6;
//        linearSearch(arr,key);
        binarySearch(arr1,key);
    }
}
