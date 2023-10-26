import java.util.*;

class avg_Array {
    public static void main(String args[]) {
        int numArray[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        int sum = 0, avg;
        for (int i : numArray) {
            sum += i;
        }
        avg = sum / numArray.length;
        System.out.println("Average of array elements is " + avg);
    }
}