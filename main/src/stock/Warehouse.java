package stock;

import java.util.List;

public class Warehouse {
    private int id;
    private List <Integer> stock;

    public Warehouse(int id, List<Integer> stock) {
        this.id = id;
        this.stock = stock;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Integer> getStock() {
        return stock;
    }
    public void setStock(List<Integer> stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", stock=" + stock +
                '}';
    }
}
