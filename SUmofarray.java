import java.util.*;
import java.io.*;

public class SUmofarray {
    public static void main(String[] args) {
        int[] arr = { 92, 23, 15, -20, 10 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("SUm of an array " + sum);
    }
}
