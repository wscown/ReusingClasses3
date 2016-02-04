/**
 * Created by wscown on 2/3/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class InventorySpec {

    @Test
    public void testaddProduct(){
        //With
        Inventory inventory = new Inventory();

        //When
        inventory.addProduct(new Product());
        inventory.addProduct(new Product());
        inventory.addProduct(new Product());
        inventory.addProduct(new Product());

        //Then
        assertEquals("Four prodcuts were added to the inventory but this was not returned by the getSize method", 4, inventory.getSize());
    }

    @Test
    public void testgetProduct(){
        //With
        Inventory inventory = new Inventory();

        Product testA = new Product(2.50f, ProductsID.BREAD, 15);
        Product testB = new Product(1.99f, ProductsID.OIL, 15);

        //When
        inventory.addProduct(testA);
        inventory.addProduct(testB);

        //Then (does not check the contents of the object are the same, checks that they are the SAME object)
        assertEquals("Product was created and entered into the inventory but was not returned when called", testA, inventory.getProduct(0));
        assertEquals("Product was created and entered into the inventory but was not returned when called", testB, inventory.getProduct(1));
    }

    @Test
    public void testinventoryValue(){
        //With
        Inventory inventory = new Inventory();

        //When
        inventory.addProduct(new Product(2.50f, ProductsID.BREAD, 15));
        inventory.addProduct(new Product(1.99f, ProductsID.OIL, 6));
        inventory.addProduct(new Product(6.05f, ProductsID.BEER, 9));
        inventory.addProduct(new Product(4.30f, ProductsID.CHEESE, 21));
        inventory.addProduct(new Product(1.49f, ProductsID.MILK, 17));

        //Then
        assertTrue("Inventory value calculated for a test set of object but this value was not returned.", 219.52f == inventory.inventoryValue());
    }
}
