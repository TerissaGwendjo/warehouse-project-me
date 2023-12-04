package stock;

import java.util.Date;

public class Item {
    private String state;
    private String category;
    private String dateOfStock;
    private int warehouse;


    public Item(String state, String category, String dateOfStock, int warehouse ) {
        //DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
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

    public String getDateOfStock() {
        return dateOfStock;
    }

    public void setDateOfStock(Date dateOfStock) {
        this.dateOfStock = String.valueOf(dateOfStock);
    }

    @Override
    public String toString() {
        return "\nItem:\n" +
                "\nstate='" + state + '\'' +
                " \ncategory='" + category + '\'' +
                " \ndateOfStock='" + dateOfStock + '\'' +
                " \nwarehouse=" + warehouse + '\n' +
                "----------------------" ;
    }
}
