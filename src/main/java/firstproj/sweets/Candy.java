package firstproj.sweets;

public class Candy extends Sweets{

    private String manufacturer;
    private double calories;

    public Candy(String title, double weight, double price, String manufacturer, double calories) {
        super(title, weight, price);
        this.manufacturer = manufacturer;
        this.calories = calories;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Конфеты: " + super.toString() + ", производитель = " + manufacturer + ", калорийность = " + calories + ";";
    }
}