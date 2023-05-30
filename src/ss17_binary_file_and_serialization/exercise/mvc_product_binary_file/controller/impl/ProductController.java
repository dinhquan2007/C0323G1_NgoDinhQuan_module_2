package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.controller.impl;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.controller.IProductController;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service.IProductService;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.service.impl.ProductService;

import java.util.Scanner;

public class ProductController implements IProductController {

    @Override
    public void menu() {
        IProductService productService = new ProductService();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Vui lòng chọn chức năng :\n" +
                    "1.Hiển thị danh sách sản phẩm\n" +
                    "2.thêm sản phẩm\n" +
                    "3.xóa sản phẩm\n" +
                    "0.thoát chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                System.out.println("cảm ơn bạn đã đến với chương trình quản lý sản phẩm");
                break;
                case 1:
                    System.out.println("Danh sách sản phẩm");
                    productService.getAll();
                    break;
                case 2:
                    System.out.println("nhập vào mã sảm phẩm");
                    java.lang.String code = scanner.nextLine();
                    System.out.println("nhập vào tên sản phẩm");
                    java.lang.String name = scanner.nextLine();
                    System.out.println("nhập vào giá sản phẩm");
                    float price = Float.parseFloat(scanner.nextLine());
                    System.out.println("nhập vào hãng sản xuất");
                    java.lang.String producer = scanner.nextLine();
                    System.out.println("nhập mô tả sản phẩm");
                    java.lang.String description = scanner.nextLine();
                    productService.addProduct(new Product(code, name, price, producer, description));
                    break;
                case 3:
                    System.out.println("nhập vào mã sản phẩm bạn muốn xóa");
                    String checkCode = scanner.nextLine();
                    productService.deleteProduct(checkCode);
                    break;
            }

        } while (choice!=0);
    }
}
