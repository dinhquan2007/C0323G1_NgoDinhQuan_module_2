package ss12_collection_framework.exercise.product_manager.repository;

import ss12_collection_framework.exercise.product_manager.model.Product;

import java.util.LinkedList;

public interface IProductRepository{
    LinkedList<Product> getAll();

    void addProduct(Product product);

    Product searchWithName(String name);

    Product getByCode(String code);

    void removeProduct(Product product);

    LinkedList<Product> getName(String name);

    void arrangeWithPriceIncrease();

    void arrangeWithPriceReduce();

}
