package org.example.ARRAYS;

public class SortingAlgorithm {
    public static void countingSort(int arr[]){//he time complexity of the countingSort function is O(n + k),
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        int[] count = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void insertionSort(int arr[]){ //time complexity : O(n2)
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;
            while(previous >=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }
    public static void selectionSort(int arr[]){//time complexity : O(n2)
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
    public static void bubbleSort(int arr[]){//time complexity : O(n2)
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
        int arr[] = {3,4,2,9,7,0};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        countingSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
