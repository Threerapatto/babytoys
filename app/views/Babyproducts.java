package views;

/**
 * Created by user on 7/10/2018.
 */
public class Babyproducts {
    private int id,agebaby,price;
    private String name,category,color;

    public Babyproducts(int id, int agebaby, int price, String name, String category, String color) {
        this.id = id;
        this.agebaby = agebaby;
        this.price = price;
        this.name = name;
        this.category = category;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getAgebaby() {
        return agebaby;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAgebaby(int agebaby) {
        this.agebaby = agebaby;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Babyproducts() {

    }
}
