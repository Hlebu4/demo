package lesson28.shoppinglist.ui;

import lesson28.shoppinglist.dto.ResponseForClientFindByIdProduct;
import lesson28.shoppinglist.entity.Product;
import lesson28.shoppinglist.service.ProductService;

import java.util.Scanner;

public class FindByIdMenu implements MenuCommand{

    private ProductService service;

    public FindByIdMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product id:");
        Integer id = scanner.nextInt();

        ResponseForClientFindByIdProduct findByIdProduct = service.findById(id);
        System.out.println(findByIdProduct);
    }

    @Override
    public String getMenuName() {
        return "Find by id Product";
    }
}
