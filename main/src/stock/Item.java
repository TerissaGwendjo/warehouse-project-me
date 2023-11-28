package stock;

import java.util.Date;

public class Item {
    private String condition;
    private String name;
    private int quantity;
    private Date manufacturingDate;


    public Item(String condition, String name, int quantity, Date manufacturingDate) {
        this.condition = condition;
        this.name = name;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "condition='" + condition + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
