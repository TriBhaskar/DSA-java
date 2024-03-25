package org.example.ARRAYS;

public class SubArray {
    public static void
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
        int arr[] = {1,-2,6,-1,3};
//        printSubArray(arr);
        maxSubarraySum(arr);
    }
}
