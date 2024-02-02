package lesson28.shoppinglist;

import lesson28.shoppinglist.entity.Product;
import lesson28.shoppinglist.repository.ProductRepositoryArrayList;
import lesson28.shoppinglist.repository.ProductRepository;
import lesson28.shoppinglist.service.ProductService;
import lesson28.shoppinglist.service.Validation;
import lesson28.shoppinglist.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
// создаем основные классы для работы сервиса

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);


        // создаем классы для формирования пунктов меню

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductMenu findAllProductMenu = new FindAllProductMenu(service);
        ExitMenu exitMenu = new ExitMenu();
        RemoveProduct removeProduct = new RemoveProduct(service);
        FindByIdMenu findById = new FindByIdMenu(service);

        List<MenuCommand> menuCommands = new ArrayList<>();
        menuCommands.add(addProductMenu);
        menuCommands.add(findAllProductMenu);
        menuCommands.add(findById);
        menuCommands.add(removeProduct);
        menuCommands.add(exitMenu);

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();

    }
}
