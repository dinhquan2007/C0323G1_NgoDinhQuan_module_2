package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service.impl;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.IProductRepository;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.impl.ProductRepository;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository=new ProductRepository();
    List<Product> productList=new ArrayList<>();
    @Override
    public void getAll() {
        System.out.println(productRepository.readToFile("src/ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat"));
    }

    @Override
    public void addProduct(Product product) {
        productList=productRepository.readToFile("src/ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat");
        productList.add(product);
        productRepository.writeProductToFile(productList,"src/ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat");
    }

    @Override
    public void deleteProduct(String checkCode) {
        productList=productRepository.readToFile("src/ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat");

    }

}
