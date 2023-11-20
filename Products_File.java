import java.io.*;
import java.util.*;

class productF implements Serializble{
    String name;
    int price, quantity;

    productF(String name,int price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

}

class Products_File {
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
        List<productF> itemList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add products? (yes/no): ");
        String Choice = sc.nextLine();
        while (!Choice.equalsIgnoreCase("no")) {
            System.out.println("Enter the product");
            String pName = sc.nextLine();
            System.out.println("Enter the price of " + pName);
            int pPrice = sc.nextInt();
            System.out.println("Enter the quantity of " + pName);
            int pQuantity = sc.nextInt();
            sc.nextLine();
            itemList.add(new productF(pName, pPrice, pQuantity));
            System.out.println("Do you want to add more products? (yes/no): ");
            Choice = sc.nextLine();
        }

        String Path = "C:\\Users\\HP\\Desktop\\Anu\\VS Code\\Git Project\\AnuRepo\\product.txt";
        File file = new File(Path);
        file.createNewFile();
        OutputStream out = new FileOutputStream("product.txt");
        PrintWriter pw = new PrintWriter(out);
        for (productF item : itemList) {
            pw.write("Name: "+item.name+"\t"+"Price: "+item.price+"\t"+"Quantity: "+item.quantity+'\n');
        }
        pw.close();
        out.close();
        System.out.println("Data written successfully!");

        Reader input = new FileReader("Products.txt");
        BufferedReader br = new BufferedReader(input);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        input.close();
    }
}
