import java.util.*;

class reverseNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reversed Number is " + reverse(num));
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;
        }
        return rev;

    }
}