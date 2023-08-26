import java.util.*;
import java.io.*;

public class AlternateSum {
    public static int AlternateNum(int n) {
        if (n % 2 == 0) {
            return AlternateNum(n - 1) - n;
        } else {
            return AlternateNum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the num");
        int n = sc.nextInt();
        int result = AlternateNum(n);
        System.out.println("Alternate Sum of given number" + result);
    }
}