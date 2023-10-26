import java.util.*;

class avg_Array {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, avg;
        for (int i : arr) {
            sum += i;
        }
        avg = sum / arr.length;
        System.out.println("Average of array elements is " + avg);
    }
}