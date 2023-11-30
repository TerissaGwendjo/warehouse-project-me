package stock;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("New","Electronics", "2022-01-01 00:00:00" ,1 );
        Item item2 = new Item("Used", "Furniture", "2022-01-02 00:00:00", 1);
        Item item3 = new Item("New", "Books", "2022-01-03 00:00:00", 2);
        Item item4 = new Item("Used", "Electronics", "2022-01-04 00:00:00", 2);
        Item item5 = new Item("New", "Furniture", "2022-01-05 00:00:00", 3);
        Item item6 = new Item("Used", "Books", "2022-01-06 00:00:00", 3);
        Item item7 = new Item("New", "Electronics", "2022-01-07 00:00:00", 4);
        Item item8 = new Item("Used", "Furniture", "2022-01-08 00:00:00", 4);
        Item item9 = new Item("Used", "Books", "2022-01-09 00:00:00", 5);
        Item item10 = new Item("Used", "Electronics", "2022-01-10 00:00:00", 5);


        //Create a list of items
        List<Item> stockItems1 = new ArrayList<>();
        stockItems1.add(item1);
        stockItems1.add(item2);

        List<Item> stockItems2 = new ArrayList<>();
        stockItems2.add(item3);
        stockItems2.add(item4);
        //System.out.println(stockItems2);


        //Create a Warehouse
        Warehouse warehouse1 = new Warehouse(1,stockItems1);
        Warehouse warehouse2 = new Warehouse(2,stockItems2);
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouse1);
        warehouseList.add(warehouse2);
        //System.out.println("This is the initial State of the Warehouse:");
        //System.out.println(warehouseList);
        warehouse1.addItem(item5);
        System.out.println(warehouse1);
        System.out.println();
        System.out.println();
        warehouse1.getStock().add(item6);
        System.out.println(warehouse1);

       /* //perform some Operations
        warehouse1.setWarehouseId(2); // change warehouse1 ID
        //System.out.println("Updated warehouse1 ID: " + warehouse1.getId());
        //System.out.println(warehouse1);
        */

    }
}
