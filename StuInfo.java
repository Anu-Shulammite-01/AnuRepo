import java.util.*;
import java.io.*;

class Stu {
    String name;
    int English;
    int Maths;
    int Science;

    public Stu(String name, int English, int Maths, int Science) {
        this.name = name;
        this.English = English;
        this.Maths = Maths;
        this.Science = Science;
    }
}

class StuInfo {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        List<Stu> SList = new ArrayList<>();
        System.out.println("DO you wanna add students?: ");
        String c = sc.nextLine();
        while(!c.equalsIgnoreCase("no")){
            System.out.print("Enter student's Name:");
            String name = sc.nextLine();
            System.out.print("Enter student's English marks:");
            int English = sc.nextInt();
            System.out.print("Enter student's Maths marks:");
            int Maths = sc.nextInt();
            System.out.print("Enter student's Science marks:");
            int Science = sc.nextInt();
            SList.add(new Stu(name, English, Maths, Science));
            sc.nextLine();
            System.out.println("\nDo u want to continue? yes/no :");
            c = sc.nextLine();
        }
        Writer w = new FileWriter("S1.csv");
        for(Stu s : SList){
            w.write(s.name + ","+ s.English+","+ s.Maths+ ","+ s.Science+"\n");
        }
        System.out.println("Written success");
        w.close();


        Reader r = new FileReader("S1.csv");
        BufferedReader br = new BufferedReader(r);
        Writer w1 = new FileWriter("R.txt");
        String l;
        while((l=br.readLine())!=null){
            String[] arr = l.split(",");
        
            int Total = (Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3]))/3;
            w1.write(arr[0]+" "+Total+"\n");     
        }
        w1.close();

        Reader r1 = new FileReader("R.txt");
        BufferedReader br1 = new BufferedReader(r1);
        String l1;
        while((l1=br1.readLine())!=null){
            System.out.println(l1);
        }
        br1.close(); 
    }
}