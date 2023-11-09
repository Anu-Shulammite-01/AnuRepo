import java.util.*;
import java.util.stream.*;

class student_Map {
    String name;
    int id;
    char grade;

    public student_Map(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

class FlatMap {
    public static void main(String[] args) {
        List<student_Map> s1 = new ArrayList<student_Map>();
        s1.add(new student_Map("Anu", 1, 'S'));
        s1.add(new student_Map("Aiden", 2, 'A'));
        s1.add(new student_Map("Aurora", 3, 'B'));

        List<student_Map> s2 = new ArrayList<student_Map>();
        s2.add(new student_Map("Xavier", 4, 'C'));
        s2.add(new student_Map("John", 5, 'F'));
        s2.add(new student_Map("Sam", 6, 'A'));

        List<List<student_Map>> finalL = Arrays.asList(s1,s2);

        // FlatMap
        List<String> result = finalL.stream().flatMap(x -> x.stream()).map(s->s.name).collect(Collectors.toList());
        System.out.println(result);
    }
}