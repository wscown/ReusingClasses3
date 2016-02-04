import java.util.ArrayList;

/**
 * Created by wscown on 2/3/16.
 */
public class Inventory {
    private ArrayList<Product> inventory;

    Inventory(){
        inventory = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        inventory.add(product);
    }

    public Product getProduct(int index){
        return inventory.get(index);
    }

    public float inventoryValue(){
        float value = 0;
        for(Product p : inventory){
            value += p.getPrice()*p.getQuantitiy();
        }
        return value;
    }

    public void printProducts(){
        System.out.println("Inventory");
        for(Product p : inventory){
            System.out.println(p.toString());
        }
    }

    //Used for testing
    public int getSize(){
        return inventory.size();
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(2.50f, ProductsID.BREAD, 15));
        inventory.addProduct(new Product(1.99f, ProductsID.OIL, 6));
        inventory.addProduct(new Product(6.05f, ProductsID.BEER, 9));
        inventory.addProduct(new Product(4.30f, ProductsID.CHEESE, 21));
        inventory.addProduct(new Product(1.49f, ProductsID.MILK, 17));

        inventory.printProducts();

        System.out.println("The value of the current inventory is " + inventory.inventoryValue());
    }
}
