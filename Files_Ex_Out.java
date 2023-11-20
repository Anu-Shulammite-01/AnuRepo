import java.io.*;

class Files_Ex_Out {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream out = new FileOutputStream("output.txt");
        PrintWriter pw = new PrintWriter(out);
        String str1 = "Hello";
        String str2 = "World!";
        int num1 = 45;
        double dbl1 = 37.986;
        pw.print(str1 + " ");
        pw.println(str2);
        pw.println("This is writing!");
        pw.format("%d %f", num1, dbl1);
        pw.close();

        //Byte Array
        byte bArray[] = {'H', 'e', 'l', 'l', 'o'};
        String s1 = " \t This is a String.";
        ByteArrayOutputStream outb = new ByteArrayOutputStream();
        outb.write(bArray);
        outb.write(s1.getBytes());
        String r = outb.toString();
        System.out.println(r);
        outb.close();

        //BufferedOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(out);
        String s2 = "This is a another String.";        
        bos.write(s2.getBytes());
        String r1 = s2.toString();
        System.out.println(r1);
    }
}