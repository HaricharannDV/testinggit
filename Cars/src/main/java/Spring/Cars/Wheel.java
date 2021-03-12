package Spring.Cars;
public class Wheel {
    
    int id;
    Double price;
    
    public Wheel(int id, Double price) {
        super();
        this.id = id;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Wheel [id=" + id + ", price=" + price + "]";
    }
}