package lesson26.homework.task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class ProductRepository {

    private final HashMap<String , Product> products ;

    public ProductRepository() {
        this.products = new HashMap<>();
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }
}
