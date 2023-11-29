package stock;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("New","Electronics", "2022-01-01 00:00:00" ,1 );
        Item item2 = new Item("Used", "Furniture", "2022-01-02 00:00:00", 1);

        //Create a list of items
        List<Item> stockItems = new ArrayList<>();
        stockItems.add(item1);
        stockItems.add(item2);

        //Create a Warehouse
        Warehouse warehouse = new Warehouse(1, stockItems);
        //System.out.println("This is the initial State of the Warehouse:");
        //System.out.println(warehouse);

        //perform some Operations
        warehouse.setId(2); // change warehouse ID
        //System.out.println("Updated warehouse ID: " + warehouse.getId());
        //System.out.println(warehouse);
        //System.out.println(item2);

        //Add a new item to the stock
        Item item3 = new Item("New", "Books", "2022-01-03 00:00:00", 2);
        warehouse.getStock().add(item3);
        //warehouse.addItem(item3);
        System.out.println("Updated Warehouse State after adding item 3: ");
        System.out.println(warehouse);
    }
}
