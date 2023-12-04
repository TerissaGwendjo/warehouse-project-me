package stock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Warehouse {
    private int warehouseId;
    private static List <Item> stock;

    public Warehouse(int warehouseId, List<Item> stock) {
        this.warehouseId = warehouseId;
        this.stock = stock;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public List<Item> getStock() {
        return stock;
    }
    public void setStock(List<Item> stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nWarehouse \n");
        stringBuilder.append("    Warehouse ID: ").append(warehouseId).append("\n");
        stringBuilder.append("    Stock:\n");

        for (Item item : stock) {
            stringBuilder.append("        ").append(item).append("\n");
        }

        stringBuilder.append("--------------------------------------------------------");

        return stringBuilder.toString();
    }

    public String removeItemByCategory(String category) {
        Iterator<Item> iterator = stock.iterator();

        boolean itemRemoved = false;

        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getCategory().equals(category)) {
                iterator.remove();
                itemRemoved = true;
            }
        }

        return itemRemoved ? "Items of category " + category + " removed successfully!" :
                "No items found in category " + category + ". No changes were made.";
    }


   /* public void Warehouse (int warehouseId) {
        stock.get(getId());
    }*/

    //Method to get Occupancy
    public int occupancy() {
        return stock.size();
    }
    //Method to add an item to the stock
    public static void addItem(Item item) {
        stock.add(item);
    }
    //Method to search for items based on a search term
    public List<Item> search(String searchTerm) {
        List<Item> matchingItems = new ArrayList<>();
        for (Item item:stock) {
            if (item.getCategory().toLowerCase().contains(searchTerm.toLowerCase())) {
                matchingItems.add(item);
            }
        }
        return matchingItems;
    }


    //Print details of each warehouse
    public static void printWarehouseDetails(List<Warehouse> warehouseList) {
        for (Warehouse warehouse : warehouseList) {
            System.out.println("Warehouse ID: " + warehouse.getWarehouseId());
            System.out.println("Stock Items:");

            for (Item item : warehouse.getStock()) {
                System.out.println("  State: " + item.getState());
                System.out.println("  Category: " + item.getCategory());
                System.out.println("  Warehouse: " + item.getWarehouse());
                System.out.println("------------------------");
            }

            System.out.println("--------------------------------------------------------------");
        }
    }


}

