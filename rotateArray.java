import java.util.*;

class rotateArray {
    public static void main(String[] args) {
        int numArray[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations:");
        int rotation1 = sc.nextInt();
        rotateArr(numArray, rotation1);
        System.out.println(Arrays.toString(numArray));
        int rotation2 = sc.nextInt();
        rotateArr(numArray, rotation2);
        System.out.println(Arrays.toString(numArray));
    }

    public static void rotateArr(int array[], int rotation) {
        for (int i = 0; i < rotation; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}