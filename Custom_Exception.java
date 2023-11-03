import java.util.*;

class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

class Custom_Exception {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> numList1 = new ArrayList<Integer>();
        for(int i=2;i<num;i++){
            if(num % i == 0){
                numList.add(i);
            }
        }
        System.out.println(numList);
        int n = numList.size(); 

        try{
            for(int j=0;j<n;j++){
                if(numList.get(j)%2==0){
                    numList1.add(numList.get(j));
                }
                else{
                    throw new MyException("There are odd factors of the given number");
                }
            }
        }
        catch (MyException e){
            System.out.print(e);
        }
        finally{
            System.out.println("\nThe list of even factors is: "+numList1);
        }
    }
}