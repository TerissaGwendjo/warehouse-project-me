package stock;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Item {
    private String state;
    private String category;
    private Date dateOfStock;
    private int warehouse;


    public Item(String state, String category, int warehouse, Date dateOfStock) {
        this.state = state;
        this.category = category;
        this.warehouse = warehouse;
        this.dateOfStock = dateOfStock;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public Date getDateOfStock() {
        return dateOfStock;
    }

    public void setDateOfStock(Date dateOfStock) {
        this.dateOfStock = dateOfStock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "condition='" + state + '\'' +
                ", name='" + category + '\'' +
                ", quantity=" + warehouse +
                ", manufacturingDate=" + dateOfStock +
                '}';
    }
}
