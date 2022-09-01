package firstproj.sweets;

public class Jellybean extends Sweets {
    private String type;

    public Jellybean(String title, double weight, double price, String type) {
        super(title, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Мармеладки: " + super.toString() + ", тип = " + type + ";";
    }
}