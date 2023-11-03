import java.util.*;

class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

class Custom_Exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList numList = new ArrayList<>();
        for(int i=2;i<num;i++){
            if(num % i == 0){
                numList.add(i);
            }
        }
        System.out.println(numList);   
    }
}