package lesson26.homework.task3;

import lesson26.homework.task1.RepositoryContacts;

public class Service implements ServiceInterface {

    ProductRepository productRepository;

    public Service(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        if (productRepository.getProducts().containsKey(product.getName())){
            System.out.println("we have " + productRepository.getProducts().get(product.getName()));
        }else {productRepository.getProducts().put(product.getName(),product);
        }
    }

    @Override
    public Product findProduct(String name) {
        return productRepository.getProducts().getOrDefault(name, null);
    }

    @Override
    public void removeProduct(Product product) {
        if (productRepository.getProducts().containsKey(product.getName())){
            productRepository.getProducts().remove(product.getName());
        }else {
            System.out.println(" product not found ");
        }
    }
}
