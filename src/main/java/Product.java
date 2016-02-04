/**
 * Created by wscown on 2/3/16.
 */
enum ProductsID{
    BREAD, OIL, CHEESE, EGGS, MILK, BEER
        }

public class Product {
    private float price;
    private ProductsID id;
    private int quantitiy;

    Product(){}

    Product(float price, ProductsID id, int quantity){
        this.price = price;
        this.id = id;
        this.quantitiy = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ProductsID getId() {
        return id;
    }

    public void setId(ProductsID id) {
        this.id = id;
    }

    public int getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", id=" + id +
                ", quantitiy=" + quantitiy +
                '}';
    }
}
