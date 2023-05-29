package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;

public interface IProductService {
    void getAll();

    void addProduct(Product product);

    void deleteProduct(String code);

}
