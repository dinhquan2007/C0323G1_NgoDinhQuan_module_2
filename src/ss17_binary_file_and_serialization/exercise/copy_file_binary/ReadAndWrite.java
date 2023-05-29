package ss17_binary_file_and_serialization.exercise.copy_file_binary;

import ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model.Product;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    public void writeListToFile(List<java.lang.String> stringList, java.lang.String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readListToFile(java.lang.String path){
        List<Product> stringList=null;
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            stringList= (List<Product>) objectInputStream.readObject();

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;

    }
}
