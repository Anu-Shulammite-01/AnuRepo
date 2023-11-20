import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class File_Modified {
    public static void main(String[] args){
        File file = new File("MFile.txt");
        if(!file.exists()){
            System.out.println("The file does not exist.");
        }
        else{
            long lastModified = file.lastModified();
            Date date=new Date(lastModified);
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String strDate=sdf.format(date);
            System.out.println("Last modified time of the file is "+strDate);
        }

    }
}