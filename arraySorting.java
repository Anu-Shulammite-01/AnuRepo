import java.util.*;

class arraySorting {
    public static void main(String[] args) {
        int numArray1[] = {12,2,23,1,90};
        String stringArray1[] = {"anu","xavier","Tae","anna"};
        
        int numArray2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numArray2.length; i++) {
            numArray2[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: "+Arrays.toString(numArray2));
        Arrays.sort(numArray2);
        System.out.println("After Sorting: "+Arrays.toString(numArray2));

        String stringArray2[] = new String[3];
        Scanner scc = new Scanner(System.in);
        for(int j=0; j<stringArray2.length;j++){
            stringArray2[j]=scc.nextLine();
        }
        System.out.println("Before Sorting: "+Arrays.toString(stringArray2));
        Arrays.sort(stringArray2);
        System.out.println("After Sorting: "+Arrays.toString(stringArray2));

        System.out.println("Sorting integer array using default method:");
        int_sort(numArray1);
        System.out.println(Arrays.toString(numArray1));

        System.out.println("Sorting string array using default method:");
        string_sort(stringArray1);
        System.out.println(Arrays.toString(stringArray1));
    }
    public static void int_sort(int array1[]){
        for(int i=0; i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                int temp = 0;
                if(array1[i]<array1[j]){
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }

    }
    public static void string_sort(String array2[]){
        for(int i=0; i<array2.length;i++){
            for(int j=0;j<array2.length-i-1;j++){
                String temp = "";
                if(array2[j].compareToIgnoreCase(array2[j+1]) > 0){
                    temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }
    }
}