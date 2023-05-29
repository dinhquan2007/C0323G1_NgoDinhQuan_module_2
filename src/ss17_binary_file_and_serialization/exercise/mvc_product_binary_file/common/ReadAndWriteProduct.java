package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.common;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;

import java.io.*;
import java.util.List;

public class ReadAndWriteProduct {
    public void writeProductListToFile(List<Product> productList, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readProductListToFile(java.lang.String path){
        List<Product> productList;
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            productList= (List<Product>) objectInputStream.readObject();

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return productList;

    }
}
