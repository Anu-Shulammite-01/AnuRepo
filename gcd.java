import java.util.*;

class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, i, gcd = 1;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        for (i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of two numbers is " + gcd);
    }
}