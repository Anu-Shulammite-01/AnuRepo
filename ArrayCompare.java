import java.util.*;

class ArrayCompare {
    public static void main(String[] args){
        int list[] = {3,5,18,4,6};
        int min = list[0];
        int max = list[0];
        
        String stringList[] = {"a","a","a"};
        String equal = stringList[0];
        String flag = "false";
        
        for(int i=0;i<list.length;i++){
            if(list[i]<min){
                min=list[i];
            }
            if(list[i]>max){
                max=list[i];
            }
        }
        System.out.println("Minimum element is "+min);
        System.out.println("Maximum element is "+max);

        for(int i=0;i<stringList.length;i++){
            if(stringList[i] == equal){
                flag = "True";
            }
        }
        if(flag == "True"){
            System.out.println("All elements are Equal");
        }
    }
}