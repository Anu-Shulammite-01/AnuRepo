import java.io.*;

class Files_Ex_In {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        InputStream in = new FileInputStream("abc.txt");
        //int i;
        /*
         * while((i=in.read())!=-1){
         * System.out.println((char)i);
         * }
         */

        System.out.println("After Skipping: ");
        in.skip(3);
        System.err.println((char) in.read());
        System.err.println((char) in.read());
        System.err.println((char) in.read());
        System.out.println("After reading: ");
        System.out.println(in.available());
        in.close();

        //ByteArray
        byte array[] = {1,2,3,4,5,6};
        ByteArrayInputStream ba = new ByteArrayInputStream(array);
        for(int i=0; i<array.length;i++){
            System.out.println(ba.read()+" ");
        }
        ba.close();

        //ObjectInputStream
        OutputStream out = new FileOutputStream("obj.txt");
        InputStream ins = new FileInputStream("obj.txt");
        int data1 = 12;
        String data2 = "This is a Program";
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeInt(data1);
        oos.writeObject(data2);
        ObjectInputStream ois = new ObjectInputStream(ins);
        System.out.println(ois.readInt());
        System.out.println(ois.readObject());
        ois.close();
        oos.close();
        out.close();
        ins.close();

        //BufferedInputStream
        InputStream ibs = new FileInputStream("abc.txt");
        BufferedInputStream bis = new BufferedInputStream(ibs);
        int b;
        while ((b = bis.read()) != -1) {
            System.out.print((char) b + " ");
        }
        bis.close();
        ibs.close();
        
    }
}