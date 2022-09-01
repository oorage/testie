package firstproj.sweets;

public class Donut extends Sweets {

    private String size;

    public Donut(String title, double weight, double price, String size) {
        super(title, weight, price);
        this.size = size;
    }

    public Donut() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Пончик: " + super.toString() + ", размер = " + size + ";";
    }
}