package ss12_collection_framework.exercise.product_manager.model;

public class Product {
    private String codeProduct;
    private String nameProduct;

    private float price;
    private int quantity;

    public Product(String codeProduct, String nameProduct, float price, int quantity) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }


    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    ;

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
