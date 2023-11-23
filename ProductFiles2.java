import java.io.*;
import java.util.*;
import java.util.stream.*;

class PItems {
    String name;
    int price;
    int quantity;

    PItems(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ProductFiles2 {
    public static void main(String[] args) throws IOException {
        List<PItems> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna add the products? (yes/no): ");
        String choice = sc.nextLine();
        while(!choice.equalsIgnoreCase("no")){
            System.out.println("Enter the name of the product: ");
            String name = sc.nextLine();
            System.out.println("Enter the price of the product: ");
            int price = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the quantity of the product: ");
            int quantity = Integer.parseInt(sc.nextLine());
            items.add(new PItems(name,price,quantity));
            System.out.println("Do you wanna add the products again? (yes/no): ");
            choice = sc.nextLine();
        }
        System.out.println("The products available are: ");
        items.stream().forEach(r->System.out.println("Item: "+r.name+" Price: "+r.price+" Available: "+r.quantity));
        System.out.println("Enter the product you wanna buy: ");
        String product = sc.nextLine();
        Optional<PItems> optr = items.stream().filter(p->product.equalsIgnoreCase(p.name)).findFirst();
        if(optr.isPresent()){
            System.out.println("How many items you wanna buy? : ");
            int cnt = sc.nextInt();
            if(cnt <= optr.get().quantity){
                optr.get().quantity -= cnt;
                System.out.println("Total cost for "+optr.get().name+" is Rs."+((optr.get().price)*cnt)+".");
                System.out.println("You have successfully purchased "+optr.get().name);
            }
            else{
                System.out.println(optr.get().name+" sold out");
            }
        }
        else{
            System.out.println("Item not found!");
        }
        Writer w1 = new FileWriter("Items.csv");
        for(PItems p:items){
            w1.write(p.name+","+p.price+","+p.quantity+"\n");
        }
        w1.close();

        System.out.println("The products available are: ");
        Reader r1 = new FileReader("Items.csv");
        BufferedReader br1 = new BufferedReader(r1);
        String line;
        while((line = br1.readLine())!=null){
            System.out.println(line);
        }
        br1.close();

        
    }
}