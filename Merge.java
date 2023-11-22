import java.io.*;
import java.util.*;

class Merge {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Writer w = new FileWriter("Employee.txt");  
        Writer w1 = new FileWriter("Employee1.txt");
        System.out.println("Enter details of Employee 1");
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the role: ");
        String role = sc.nextLine();
        System.out.println("Enter the salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        //Writing into Employee1.txt
        w1.write("Name: "+name+" Role: "+role+" Salary: "+salary+"\n");
        w1.close();


        Writer w2 = new FileWriter("Employee2.txt");
        System.out.println("Enter details of Employee 2");
        System.out.println("Enter the name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter the role: ");
        String role1 = sc.nextLine();
        System.out.println("Enter the salary: ");
        int salary1 = Integer.parseInt(sc.nextLine());
        //Writing into Employee2.txt
        w2.write("Name: "+name1+" Role: "+role1+" Salary: "+salary1+"\n");
        w2.close();

        Writer w3 = new FileWriter("Employee3.txt");
        System.out.println("Enter details of Employee 3");
        System.out.println("Enter the name: ");
        String name2 = sc.nextLine();
        System.out.println("Enter the role: ");
        String role2 = sc.nextLine();
        System.out.println("Enter the salary: ");
        int salary2 = Integer.parseInt(sc.nextLine());
        //Writing into Employee3.txt
        w3.write("Name: "+name2+" Role: "+role2+" Salary: "+salary2+"\n");
        w3.close();

        //Merging 3 files
        Reader r1 = new FileReader("Employee1.txt");
        BufferedReader br1 = new BufferedReader(r1);
        Reader r2 = new FileReader("Employee2.txt");
        BufferedReader br2 = new BufferedReader(r2);
        Reader r3 = new FileReader("Employee3.txt");
        BufferedReader br3 = new BufferedReader(r3);
        String line1;
        while((line1=br1.readLine())!=null){
            w.write(line1+"\n");
        }
        String line2;
        while((line2=br2.readLine())!=null){
            w.write(line2+"\n");
        }
        String line3;
        while((line3=br3.readLine())!=null){
            w.write(line3+"\n");
        }
        w.close();
        System.out.println("Merged Successfully!");

        System.out.println("The details of Employee are: ");
        Reader r = new FileReader("Employee.txt");
        BufferedReader br = new BufferedReader(r);
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}