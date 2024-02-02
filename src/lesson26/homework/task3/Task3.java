package lesson26.homework.task3;

import java.util.Map;

/*
Составить каталог продуктов. Осуществить добавление продуктов в каталог, поиск продукта и удаление.
Вывести информацию о результате операции

public class Product {
private String name;
private double price;}
 */
public class Task3 {
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        Product iphone = new Product("iphone" , 1500.5);
        Product nokia = new Product("nokia" , 1600.5);
        Product samsung = new Product("samsung" , 500.5);

        Service service = new Service(productRepository);

        service.addProduct(iphone);
        service.addProduct(nokia);
        service.addProduct(samsung);
        service.addProduct(iphone);
        System.out.println(" \n ");

        for (Map.Entry<String,Product> entry : productRepository.getProducts().entrySet()){
            System.out.println(entry);
        }

        System.out.println(" \n find by product \n");

        System.out.println(service.findProduct("iphone"));
        System.out.println(service.findProduct("eee"));

        System.out.println("remove Product ");
        service.removeProduct(nokia);
        service.removeProduct(nokia);

        System.out.println(" \n after remove nokia \n");
        for (Map.Entry<String,Product> entry : productRepository.getProducts().entrySet()){
            System.out.println(entry);
        }

    }
}
