import java.util.Comparator;
import java.util.Optional;
import java.util.*;
import java.util.stream.*;

class Min_Max {

    public static void main(String[] args) {
        List<Integer> numL = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 1, 5, 7);
        long c = numL.stream().distinct().count();
        System.out.println("Count of distinct elements: " + c);

        Optional<Integer> min = numL.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println("Minimum value: " + min.get());

        Optional<Integer> max = numL.stream().max((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println("Maximum Value: " + max.get());
        int sum = (int) numL.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

        List<String> sList = Arrays.asList("A","B","C","1","2","3");
        Optional<String> str = sList.stream().reduce((value,cvalue)->{return (cvalue+value);});
        System.out.println(str.get());

        Object arr[] = sList.stream().toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        System.out.println("Ascending Order");
        sList.stream().sorted().forEach(System.out::println);

        System.out.println("Descending Order");
        sList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        boolean val = numL.stream().distinct().anyMatch(value -> {
            return value>1;
        }); 
        System.out.println(val);


        boolean val1 = numL.stream().distinct().allMatch(value -> {
            return value>1;
        }); 
        System.out.println(val1);


        boolean val2 = numL.stream().distinct().noneMatch(value -> {
            return value>1;
        }); 
        System.out.println(val2);


        Optional<Integer> val3 = numL.stream().distinct().findAny(); 
        System.out.println(val3);

        Optional<Integer> val4 = numL.stream().distinct().findFirst(); 
        System.out.println(val4.get());


        List<String> L1 = Arrays.asList("Dog", "Cat", "Monkey","Lion");
        List<String> L2 = Arrays.asList("Peacock","Eagle","Sparrow");

        Stream<String> s1 = L1.stream();
        Stream<String> s2 = L2.stream();

        List<String> Animals = Stream.concat(s1,s2).collect(Collectors.toList());
        System.out.println(Animals);

        List<String> sortedAnimals = Animals.parallelStream().sorted().collect(Collectors.toList());
        System.out.println(sortedAnimals);
    }
}