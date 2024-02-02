package lesson28.shoppinglist.service;

import lesson28.shoppinglist.dto.*;
import lesson28.shoppinglist.repository.ProductRepository;
import lesson28.shoppinglist.dto.error.ErrorCode;
import lesson28.shoppinglist.dto.error.ErrorDto;
import lesson28.shoppinglist.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private  ProductRepository productRepository;
    private  Validation validation;

    public ProductService(ProductRepository productRepository, Validation validation) {
        this.productRepository = productRepository;
        this.validation = validation;
    }

    public ResponseForClientAddProduct addNewProduct(ProductDto productDto){
        /*
        1) отдать входные данные на проверку - метод Validation
        2) если из валидации возвращается список ошибок НЕ ПУСТОЙ -> мы должны создать объект ResponseForClientAddProduct
        в который помещаем значение id = 0 и List<ErrorDto> - со списком ошибок
        3) если список ошибок пуст - отправляем в репозиторий, получаем ответ от репозитория с номером id,
        создаем объект ResponseForClientAddProduct в который помещаем значение id полученного из репозитория и пустой список ошибок
         */

        List<ErrorDto> errors = validation.validate(productDto);
        Integer newId = errors.isEmpty() ? productRepository.addProduct(productDto) : 0;

        return new ResponseForClientAddProduct(newId, errors);

        }

    public ResponseForClientFindAllProducts findAll(){
        List<Product> products = productRepository.findAll();

        List<ProductForClient> response = new ArrayList<>();
        List<ErrorDto> errors = new ArrayList<>();

        for (Product product : products){
            response.add(new ProductForClient(product.getProductName(), product.getDescription()));
        }

        if (products.isEmpty()) {
            errors.add(new ErrorDto(ErrorCode.IE_400, "No any records into database"));
        }

        return new ResponseForClientFindAllProducts(response, errors);
    }

    public ResponseForClientFindByIdProduct findById(Integer id){
        Product productById = productRepository.findById(id);

        List<ErrorDto> errors = new ArrayList<>();
        ProductForClient productForClient = new ProductForClient("","");

        if (productById != null) {
            productForClient = new ProductForClient(productById.getProductName(), productById.getDescription());
        }
        else {
            errors.add(new ErrorDto(ErrorCode.IE_400,"Product by ID: " + id + " not found"));
        }

        return new ResponseForClientFindByIdProduct(productForClient, errors);

    }

    public ResponseForClientRemoveProduct removeProductById(Integer id){
        Product productById = productRepository.findById(id);
        List<ErrorDto> errors = new ArrayList<>();

        if (productById != null) {
            productRepository.removeById(id);
            return new ResponseForClientRemoveProduct("Remove" , errors);
        }
        else {
            errors.add(new ErrorDto(ErrorCode.IE_400,"Product by ID: " + id + " not found"));
        }

        return new ResponseForClientRemoveProduct("error/errors" , errors);
    }



}
