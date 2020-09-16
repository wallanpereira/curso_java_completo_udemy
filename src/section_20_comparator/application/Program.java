package section_20_comparator.application;

import section_20_comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("AppleWatch", 1250.00));
        list.add(new Product("Zefone", 200.00));


        list.sort((product, t1) -> product.getName().toUpperCase().compareTo(t1.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
