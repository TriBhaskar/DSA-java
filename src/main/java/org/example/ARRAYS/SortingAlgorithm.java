package org.example.ARRAYS;

public class SortingAlgorithm {
    public static void insertionSort(int arr[]){
        int temp=0;
        for(int i=1; i<arr.length; i++){
            int current = i;
            int previous = i-1;
            while(previous >=0 && arr[current]<arr[previous]){
                temp = arr[current];
                arr[current]= arr[previous];
                arr[previous]=temp;
                previous--;
                current--;
            }
        }
    }
    public static void selectionSort(int arr[]){
        int temp=0;
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for (int j=i+1; j<arr.length; j++){
               if(arr[minPos] > arr[j]){
                   minPos = j;
               }
            }
            temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void bubbleSort(int arr[]){
        int temp=0;
        boolean swapped;
        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,9,7,0};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
