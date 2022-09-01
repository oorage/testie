package firstproj.sweets;

public abstract class Sweets {
    private String title;
    private double weight;
    private double price;

    public Sweets(String title, double weight, double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public Sweets() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getTotalPrice(Sweets[] box) {
        double price = 0;
        for (Sweets someSweet : box) {
            price += someSweet.getPrice();
        }
        return price;
    }

    public static double getTotalWeight(Sweets[] box) {
        double weight = 0;
        for (Sweets someSweet : box) {
            weight += someSweet.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "название = " + title +
                ", вес = " + weight +
                ", цена = " + price;
    }
}
