package ss12_collection_framework.exercise.product_manager.service.impl;

import ss12_collection_framework.exercise.product_manager.model.Product;
import ss12_collection_framework.exercise.product_manager.repository.IProductRepository;
import ss12_collection_framework.exercise.product_manager.repository.impl.ProductRepository;
import ss12_collection_framework.exercise.product_manager.service.IProductService;

import java.util.*;

public class ProductService implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static IProductRepository productRepository = new ProductRepository();

    @Override
    public void displayAll() {
        LinkedList<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(code, name, price, quantity);
        productRepository.addProduct(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deleteProduct() {
        System.out.print("Bạn muốn xóa sản phẩm nào. Vui lòng nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        Product product = productRepository.getByCode(code);
        if (product == null) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên: " + product.getNameProduct());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.removeProduct(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void repairProduct() {
        System.out.println("Bạn muốn sửa sản phẩm có mã nào ??");
        String code = scanner.nextLine();
        Product product = productRepository.getByCode(code);
        if (product == null) {
            System.out.println("không có sản phẩm nào mã " + code);
        } else {
            System.out.println("bạn có muốn sửa sản phẩm với mã :" + code + " và tên :" + product.getNameProduct());
            System.out.println("1.sửa");
            System.out.println("2.suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("mã sản phẩm sẽ là :");
                String codeNew = scanner.nextLine();
                product.setCodeProduct(codeNew);
                System.out.println("tên sản phẩm sẽ là :");
                String nameNew = scanner.nextLine();
                product.setNameProduct(nameNew);
                System.out.println("giá sản phẩm sẽ là :");
                String priceNew = scanner.nextLine();
                product.setPrice(Float.parseFloat(priceNew));
                System.out.println("số lượng sản phẩm sẽ là :");
                String quantityNew = scanner.nextLine();
                product.setQuantity(Integer.parseInt(quantityNew));
                System.out.println("bạn đã thay đổi sản phầm :" + product);
            }
        }
    }

    @Override
    public void findWithName() {
        System.out.println("bạn muốn tìm sản phẩn tên gì??");
        String name = scanner.nextLine();
        Product product = productRepository.getName(name);
        System.out.println(product);
    }

    @Override
    public void arrangeWithPriceIncrease() {
        productRepository.arrangeWithPriceIncrease();
    }

    @Override
    public void arrangeWithPriceReduce() {
        productRepository.arrangeWithPriceReduce();
    }


}
