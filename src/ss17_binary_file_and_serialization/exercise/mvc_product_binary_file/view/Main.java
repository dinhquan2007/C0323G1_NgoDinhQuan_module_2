package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.view;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.controller.IProductController;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.controller.impl.ProductController;

public class Main {
    public static void main(String[] args) {
        IProductController productController=new ProductController();
        System.out.println("Chào mừng bạn đến với chương trình quản lý sản phẩm");
        productController.menu();
    }
}
