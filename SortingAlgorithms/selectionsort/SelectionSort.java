package SortingAlgorithms.selectionsort;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1; j<n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting: ");
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        sc.close();

    }
}
