package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.impl;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.common.ReadAndWriteProduct;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    ReadAndWriteProduct readAndWriteProduct=new ReadAndWriteProduct();

     {
        Product product1 = new Product("A-001", "Bánh Chocolat",16000, "Orion", "Bánh xuất xứ Mỹ tho");
        Product product2 = new Product("A-002", "Bánh Chuối", 15000, "Trung quốc", "Bánh xuất xứ tàu");
        Product product3 = new Product("A-003", "Bánh trứng", 20000, "orion", "Bánh xuất xứ Việt Nam");
        Product product4 = new Product("A-004", "Bánh gạo", 18000, "Vina", "Bánh xuất xứ Việt Nam");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        readAndWriteProduct.writeProductListToFile(productList,"src/ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat");
    }



    @Override
    public List<Product> readToFile(String path) {
        return ReadAndWriteProduct.readProductListToFile(path);
    }

    @Override
    public void writeProductToFile(List<Product> productList, String path) {
        readAndWriteProduct.writeProductListToFile(productList,path);
    }
}
