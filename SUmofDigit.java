import java.util.*;
import java.io.*;

public class SUmofDigit {
    public static int SumofNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n % 10 + SumofNum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the num");
        int n = sc.nextInt();
        int result = SumofNum(n);
        System.out.println("Sum of given number" + result);
    }
}
