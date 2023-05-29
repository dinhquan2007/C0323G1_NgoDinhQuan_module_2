package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> readToFile(String path);

     void writeProductToFile(List<Product> productList,String path);


}
