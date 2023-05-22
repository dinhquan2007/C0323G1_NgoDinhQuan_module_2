package ss12_collection_framework.exercise.product_manager.controller;

import ss12_collection_framework.exercise.product_manager.model.Product;
import ss12_collection_framework.exercise.product_manager.service.IProductService;
import ss12_collection_framework.exercise.product_manager.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IProductService productService = new ProductService();

    public static void menu() {
        while (true) {
            System.out.println("lựa chọn chức năng : ");
            System.out.println("1.hiển thị danh sách sản phẩm");
            System.out.println("2.thêm sản phẩm ");
            System.out.println("3.sửa sản phẩm theo mã");
            System.out.println("4.xóa sản phẩm theo mã");
            System.out.println("5.tìm kiếm sản phẩm theo tên");
            System.out.println("6.sắp xếp theo giá tăng dần");
            System.out.println("7.sắp xếp theo giá giảm dần");
            System.out.println("0.thoát");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 0:
                    System.out.println("cảm ơn bạn đã đến gian hàng chúng tui");
                    System.exit(1);
                case 1:
                    productService.displayAll();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.repairProduct();
                    break;
                case 4:
                    productService.deleteProduct();
                    break;
                case 5:
                    productService.findWithName();
                    break;
                case 6:
                    productService.arrangeWithPriceIncrease();
                    break;
                case 7:
                    productService.arrangeWithPriceReduce();
                    break;
            }
        }
    }
}
