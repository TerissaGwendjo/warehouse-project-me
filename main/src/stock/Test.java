package stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create a LIst of items
        List<Item> stockItems = new ArrayList<>();
        for (int i=0; i<1;i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.println("State (New/Used): ");
            String state = scanner.next();

            System.out.println("Category: ");
            String category = scanner.next();

            System.out.println("Date of Stock (yyyy-MM-dd HH:mm:ss): ");
            String dateOfStock = scanner.next();
            scanner.nextLine(); // Consume the newline character in the buffer to avoid error message on console

            System.out.println("Warehouse ID: ");
            int warehouse = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character in the buffer to avoid error message on console

            stockItems.add(new Item(state, category, dateOfStock, warehouse));
        }

            //Create a list of warehouses
        List<Warehouse> warehouseList = new ArrayList<>();
        for (int i =0; i<5; i++) {
            System.out.println("Enter details for Warehouse " +(i+1) + ":");
            System.out.println("Warehouse ID: ");
            int warehouseId = scanner.nextInt();

            //Add items to the warehouse
            List<Item> warehouseItems = new ArrayList<>();
            for (Item item:stockItems) {
                if (item.getWarehouse() ==warehouseId){
                    warehouseItems.add(item);
                }
            }
            warehouseList.add(new Warehouse(warehouseId,warehouseItems));
            }
        //Print the list of warehouses
        System.out.println("Warehouse List:");
        for (Warehouse warehouse:warehouseList) {
            System.out.println(warehouse);
        }
        scanner.close();
    }

}

    // List<Item> warehouseItems = new ArrayList<>();: This line creates a new ArrayList called warehouseItems
// to store Item objects that belong to a specific warehouse. This list will be used to gather items with a matching warehouse ID.
//if (item.getWarehouseId() == warehouseId) { ... }: Inside the loop, this condition checks if the warehouseId of the
// current Item (item) matches the specified warehouseId. If the condition is true, it means the item belongs to the current warehouse being processed.
//warehouseItems.add(item);: If the condition is true, the current Item is added to the warehouseItems list.
// warehouseList.add(new Warehouse(warehouseId, warehouseItems));: After the loop, a new Warehouse object is created
// with the specified warehouseId and the list of items (warehouseItems) belonging to that warehouse. This Warehouse
// object is then added to the warehouseList, representing the list of all warehouses.
// warehouseList.add(new Warehouse(warehouseId, warehouseItems));: After the loop, a new Warehouse object is created
// with the specified warehouseId and the list of items (warehouseItems) belonging to that warehouse.
// This Warehouse object is then added to the warehouseList, representing the list of all warehouses.
/*In summary, this code is creating a list (warehouseItems) that contains all the items with a specific warehouseId
from the stockItems list. It then creates a new Warehouse object with the specified warehouseId and the list of items for that warehouse, and finally, adds this Warehouse object to the overall list of warehouses (warehouseList*/

