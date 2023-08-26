
/**
 * Fibancci 
 */
import java.util.*;
import java.io.*;

public class Fibnacci {
    public static int FibnacciNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return FibnacciNum(n - 1) + FibnacciNum(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number :");
        int n = sc.nextInt();
        int result = FibnacciNum(n);
        System.out.println("Fibnacci of given number is " + result);

    }
}