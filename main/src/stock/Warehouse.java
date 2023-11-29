package stock;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int id;
    private List <Item> stock;

    public Warehouse(int id, List<Item> stock) {
        this.id = id;
        this.stock = stock;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Item> getStock() {
        return stock;
    }
    public void setStock(List<Item> stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", stock=" + stock +
                '}';
    }

    //Method to get Occupancy
    public int occupancy() {
        return stock.size();
    }
    //Method to add an item to the stock
    public void addItem (Item item) {
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


}
