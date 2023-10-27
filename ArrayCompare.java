import java.util.*;

class ArrayCompare {
    public static void main(String[] args){
        int numList[] = {3,5,18,4,6};
        int min = numList[0];
        int max = numList[0];
        
        String stringList[] = {"a","a","a"};
        String equal = stringList[0];
        String flag = "True";
        
        for(int i=0;i<numList.length;i++){
            if(numList[i]<min){
                min=numList[i];
            }
            if(numList[i]>max){
                max=numList[i];
            }
        }
        System.out.println("Minimum element is "+min);
        System.out.println("Maximum element is "+max);

        for(int i=0;i<stringList.length;i++){
            while(stringList[i] != stringList[0]){
                flag = "False";
                break;
            }
        }
        if(flag == "True"){
            System.out.println("All elements are Equal");
        }
        else{
            System.out.println("Not all elements are Equal");
        }
    }
}