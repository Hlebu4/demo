package lesson28.shoppinglist.ui;

import lesson28.shoppinglist.dto.ResponseForClientRemoveProduct;
import lesson28.shoppinglist.service.ProductService;

import java.util.Scanner;

public class RemoveProduct implements MenuCommand{
    private ProductService service;

    public RemoveProduct(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product id:");
        Integer id = scanner.nextInt();

        ResponseForClientRemoveProduct removeProductResult = service.removeProductById(id);
        System.out.println(removeProductResult);
    }

    @Override
    public String getMenuName() {
        return "Remove product";
    }
}

