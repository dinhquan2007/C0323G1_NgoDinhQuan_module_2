package ss12_collection_framework.exercise.product_manager.repository.impl;

import ss12_collection_framework.exercise.product_manager.model.Product;
import ss12_collection_framework.exercise.product_manager.repository.IProductRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import static ss12_collection_framework.exercise.product_manager.service.impl.ProductService.productRepository;

public class ProductRepository implements IProductRepository {
    private static final LinkedList<Product> products=new LinkedList<>();
    static {
    products.add(new Product("A-001","Bánh orion",15000,30));
    products.add(new Product("A-002","Bánh Cosy",10000,30));
    products.add(new Product("A-003","Bánh Chocolate",25000,30));
    products.add(new Product("A-004","Bánh trứng",30000,30));
    products.add(new Product("A-005","Bánh khoai",25000,30));
    products.add(new Product("A-006","Bánh Chuối",35000,30));
    }


    @Override
    public LinkedList<Product> getAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
    products.add(product);
    }

    @Override
    public Product searchWithName(String name) {
        for (Product p:products){
            if (p.getNameProduct().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product getByCode(String code) {
        for (Product p:products) {
            if (p.getCodeProduct().equals(code)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public Product getName(String name) {
        for (Product p:products) {
            if (p.getNameProduct().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void arrangeWithPriceIncrease() {
    products.sort(new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice()>o2.getPrice()){
                return  1;
            }else{
                return -1;
            }
        }
    });
    }

    @Override
    public void arrangeWithPriceReduce() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()<o2.getPrice()){
                    return  1;
                }else{
                    return -1;
                }
            }
        });
    }
}
