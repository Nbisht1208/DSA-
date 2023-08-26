public class SumofPower {
    public static void main(String[] args) {
        int number = 153;
        int numberOfDigits = String.valueOf(number).length();
        int sum = checkArmstrong(number, numberOfDigits);
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static int checkArmstrong(int number, int numberOfDigits) {
        if (number == 0) {
            return 0;
        } else {
            int remainder = number % 10;
            return (int) (Math.pow(remainder, numberOfDigits) + checkArmstrong(number / 10, numberOfDigits));
        }
    }
}
