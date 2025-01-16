package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
        sc.close();
    }
}
