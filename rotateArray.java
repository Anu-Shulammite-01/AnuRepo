import java.util.*;

class rotateArray {
    public static void main(String[] args) {
        int numArray[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations:");
        int n = sc.nextInt();
        rotateArr(numArray, n);
        System.out.println(Arrays.toString(numArray));
        int n1 = sc.nextInt();
        rotateArr(numArray, n1);
        System.out.println(Arrays.toString(numArray));
    }

    public static void rotateArr(int array[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}