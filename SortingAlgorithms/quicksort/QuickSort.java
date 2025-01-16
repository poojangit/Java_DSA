package SortingAlgorithms.quicksort;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
        sc.close();

    }
}
