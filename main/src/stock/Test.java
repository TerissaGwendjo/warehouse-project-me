package stock;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("New","Electronics", "2022-01-01 00:00:00" ,1 );
        Item item2 = new Item("Used", "Furniture", "2022-01-02 00:00:00", 1);
        Item item3 = new Item("New", "Books", "2022-01-03 00:00:00", 2);

        //Create a list of items
        List<Item> stockItems = new ArrayList<>();
        stockItems.add(item1);
        stockItems.add(item2);
        stockItems.add(item3);
        //System.out.println(stockItems);


        //Create a Warehouse
        Warehouse warehouse1 = new Warehouse(1,stockItems);
        Warehouse warehouse2 = new Warehouse(2,stockItems);
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouse1);
        warehouseList.add(warehouse2);
        //System.out.println("This is the initial State of the Warehouse:");
        System.out.println(warehouseList);

       /* //perform some Operations
        warehouse1.setWarehouseId(2); // change warehouse1 ID
        //System.out.println("Updated warehouse1 ID: " + warehouse1.getId());
        //System.out.println(warehouse1);
        //System.out.println(item2);

        //Add a new item to the stock
        Item item3 = new Item("New", "Books", "2022-01-03 00:00:00", 2);
        warehouse1.getStock().add(item3);
        //warehouse1.addItem(item3);
        System.out.println("Updated Warehouse State after adding item 3: ");
        System.out.println(warehouse1);

        */


    }
}
