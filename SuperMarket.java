import java.util.*;
import java.util.stream.*;
class products{
    String pname;
    int price;
    public products(String pname, int price){
        this.pname = pname;
        this.price = price;
    }
}

class SuperMarket{
    public static void main(String[] args){
        List<products> productList = Arrays.asList(new products("Milk", 40),new products("Soap", 200),new products("Maggi", 350),new products("Shampoo", 75),new products("Ice cream", 350));
        System.out.println("The products available in supermarket are: ");
        productList.stream().forEach(pr->System.out.println(pr.pname));
        productList.stream().filter(p->p.price>100).forEach(pr->System.out.println("The elements are: "+pr.pname));
        long count = productList.stream().filter(p->p.price<100).count();
        System.out.println("Count of products with prices less than 100: "+count);
        long count2 = productList.stream().filter(ps->ps.pname!=null).count();
        System.out.println("Total count of products: "+count2);
    }
}