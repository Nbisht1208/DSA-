import java.util.Scanner;

public class Factorialnum {
    public static int FactorialNum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * FactorialNum(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n = sc.nextInt();
        int result = FactorialNum(n);
        System.out.println("factorial of given number is : " + result);
    }
}