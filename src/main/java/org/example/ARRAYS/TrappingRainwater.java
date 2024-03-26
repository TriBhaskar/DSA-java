package org.example.ARRAYS;

import java.util.Arrays;

public class TrappingRainwater {
    //Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
    // height = [4,2,0,6,3,2,5]
    //use Auxiliary Arrays

    //learning 1: min no of bars > 2 (for water to get trapped), 2: Asc/Desc no water is trapped
    //Water Level = min(max left bar, max right bar)
    // Trapped water = (Water level - height of the bar) * width
    // Trapped water = (min(max left bar, max right bar) - height of the bar)* width
    //use two auxiliary(helper) array for left max bar and right max bar

    public static boolean arraySortedOrNot(int arr[], int n)
    {
        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;

        // No unsorted pair found
        return true;
    }
    public static void waterLevel(int leftMaxBar[],int rightMaxBar[],int arr[]){
        int length= arr.length;
        leftMaxBar[0]=arr[0];
        rightMaxBar[length-1]=arr[length-1];
        for(int i=1; i<length; i++){
            leftMaxBar[i]=Math.max(leftMaxBar[i-1],arr[i]);
        }
        for (int i=length-2; i>=0; i--){
            rightMaxBar[i]=Math.max(rightMaxBar[i+1],arr[i]);
        }
    }

    public static int trapRainWaterSolution(int arr[]){
        int length = arr.length;
        int trappedRainWater = 0;
        if(arr.length <3 || arraySortedOrNot(arr,length)){
            return trappedRainWater;
        }else{
            int leftMaxBar[] = new int[length];
            int rightMaxBar[] = new int[length];
            waterLevel(leftMaxBar,rightMaxBar,arr);
            for (int i=0; i<length; i++){
                trappedRainWater = trappedRainWater + Math.min(leftMaxBar[i],rightMaxBar[i])-arr[i];
//                trappedRainWater = Math.min(leftMaxBar[i],rightMaxBar[i])-arr[i] *width; //width is 1 so not including it
            }
            return trappedRainWater;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped rainwater is : "+trapRainWaterSolution(arr));
    }
}
