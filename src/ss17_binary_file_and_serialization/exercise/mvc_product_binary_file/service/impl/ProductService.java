package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service.impl;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.IProductRepository;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.impl.ProductRepository;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice;

    @Override
    public void getAll() {
        productList = productRepository.readToFile();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct(Product product) {
        productList = productRepository.readToFile();
        productList.add(product);
        productRepository.writeProductToFile(productList);
    }

    @Override
    public void deleteProduct(String checkCode) {
        productList = productRepository.readToFile();
        if (productRepository.checkId(checkCode) == null) {
            System.out.println("không có sản phẩm mã :" + checkCode);
        } else {
            System.out.println("bạn c muốn xóa :" +productRepository.checkId(checkCode)+"\n" +
                    "1.xóa\n" +
                    "2.hủy");
            choice= Integer.parseInt(scanner.nextLine());
            if (choice==1){
                productList.remove(productRepository.checkId(checkCode));
                System.out.println("đã xóa sản phẩm :" + productRepository.checkId(checkCode));
                productRepository.writeProductToFile(productList);
            }
        }
    }

}
