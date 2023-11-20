import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Reader r = new FileReader("readFile.txt");
        Writer w = new FileWriter("copiedFile.txt");
        int data;
        while((data = r.read())!=-1){
            w.write(data);   
        }
        System.out.println("File copied Successfully");
        w.close();
        r.close();
    }
}