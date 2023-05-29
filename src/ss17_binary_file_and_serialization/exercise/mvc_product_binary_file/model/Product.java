package ss17_binary_file_and_serialization.exercise.mvc_product_binary_file.model;

import java.util.Objects;

public class Product {
private java.lang.String code;
private java.lang.String name;
private float price;
private java.lang.String producer;
private java.lang.String description;

    public Product(java.lang.String code, java.lang.String name, float price, java.lang.String producer, java.lang.String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code.equals(product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public java.lang.String getCode() {
        return code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public java.lang.String getProducer() {
        return producer;
    }

    public void setProducer(java.lang.String producer) {
        this.producer = producer;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @Override
public java.lang.String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
