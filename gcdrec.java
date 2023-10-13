import java.util.*;

class gcdrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int gcd = hcf(num1, num2);
        System.out.println("The GCD of num1,num2 is" + gcd);
    }

    public static int hcf(int num1, int num2) {
        if (num2 != 0)
            return hcf(num2, num1 % num2);
        else
            return num1;
    }
}