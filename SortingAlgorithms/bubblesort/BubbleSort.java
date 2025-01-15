package SortingAlgorithms.bubblesort;

import java.util.Scanner;

class BubbleSort {
 public static void bubbleSort(int[] arr){
    int n = arr.length-1;
    boolean isSwapped ;
    for(int i=0; i<n;i++ ){
        isSwapped = false;
        for(int j=0; j<n-i;j++){
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                isSwapped = true;

            }
        }
        if(!isSwapped){
            break;
        }
        
    }
    System.out.println("After Sorting : ");
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements:  ");
    for(int i = 0; i<size; i++){
        arr[i] = sc.nextInt();
    }
    bubbleSort(arr);
    sc.close();
 }
}