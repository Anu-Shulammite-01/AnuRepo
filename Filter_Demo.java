import java.util.*;
import java.util.stream.Collectors;
class product{
    int id;
    String name;
    double price;

    public product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
class Filter_Demo{
    public static void main(String[] args){
        List<product> plist = new ArrayList<product>();
        //add elements to the list
        plist.add(new product(1,"Hp Laptop",60000));
        plist.add(new product(2,"Dell Laptop",45000));
        plist.add(new product(3,"Sony Laptop",30000));
        plist.add(new product(4,"Mac Laptop",80000));

        plist.stream().filter(p->p.price>30000).forEach(pr->System.out.println(pr.name));
        List<Double> pricelist =plist.stream().filter(p->p.price>30000).map(e->e.price+5000).collect(Collectors.toList());
        System.out.println(pricelist);
    }
}