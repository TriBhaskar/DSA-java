package org.example.ARRAYS;

public class SubArray {
    //kadanes algorithm
    public static void maxSubArraySumKadanesAlgo(int[] arr){
        int currentSum=0, maxSum=Integer.MIN_VALUE;
        //a corner case if all the numbers are negative
        boolean flag=true;
        for (int i=0;i<arr.length; i++){
            if (arr[i]>0){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("All no are negative");
            return;
        }
        for (int i=0; i<arr.length; i++){
            currentSum = currentSum + arr[i];
            if (currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("our max subarray sum is : "+maxSum);
    }
    public static void prefixSumArray(int arr[]){
    int preSumArr[] = new int[arr.length];
    int currentSum=0, maxSum=Integer.MIN_VALUE;
    //caluclate prefixArray
    preSumArr[0]= arr[0];
        for (int i=1; i<preSumArr.length; i++){
            preSumArr[i]=preSumArr[i-1] + arr[i];
        }
        for (int i=0; i<arr.length; i++){
            //i = start
            for (int j=i; j<arr.length; j++){
                //j = end
                currentSum = i==0 ? preSumArr[j] : preSumArr[j] - preSumArr[i-1];
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void maxSubarraySum(int arr[]){
        int currentSum=0, maxSum=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                currentSum=0;
                for (int k=i; k<=j; k++){
                    currentSum = currentSum + arr[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void printSubArray(int arr[]){
        int sum=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum= sum + arr[k];
                }
                System.out.print("  Sum = "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//        printSubArray(arr);
//        maxSubarraySum(arr);
//        prefixSumArray(arr);
        maxSubArraySumKadanesAlgo(arr);
    }
}
