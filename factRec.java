import java.util.*;

class factRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is : " + factRecursion(num));
    }

    public static int factRecursion(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factRecursion(num - 1);
        }
    }
}