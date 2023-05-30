package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.impl;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.common.ReadAndWriteProduct;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;
import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepository implements IProductRepository {
    public final String PATH="ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat";
    private List<Product> productList = new ArrayList<>();
    ReadAndWriteProduct readAndWriteProduct=new ReadAndWriteProduct();

//      {
//        Product product1 = new Product("A-001", "Bánh Chocolat",16000, "Orion", "Bánh xuất xứ Mỹ tho");
//        Product product2 = new Product("A-002", "Bánh Chuối", 15000, "Trung quốc", "Bánh xuất xứ tàu");
//        Product product3 = new Product("A-003", "Bánh trứng", 20000, "orion", "Bánh xuất xứ Việt Nam");
//        Product product4 = new Product("A-004", "Bánh gạo", 18000, "Vina", "Bánh xuất xứ Việt Nam");
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//        productList.add(product4);
//        readAndWriteProduct.writeProductListToFile(productList,"ss17_binary_file_and_serialization/exercise/mvc_product_binary_file/data/data.dat");
//    }



    @Override
     public  List<Product> readToFile() {
        return ReadAndWriteProduct.readProductListToFile(PATH);
    }

    @Override
    public void writeProductToFile(List<Product> productList) {
        readAndWriteProduct.writeProductListToFile(productList,PATH);
    }

    @Override
    public Product checkId(String checkCode) {
        productList=readAndWriteProduct.readProductListToFile(PATH);
        for (Product p:productList) {
            if (p.getCode().equals(checkCode)){
                return p;
            }
        }
        return null;
    }
}
