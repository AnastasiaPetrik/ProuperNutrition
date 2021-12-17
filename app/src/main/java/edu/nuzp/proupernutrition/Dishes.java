package edu.nuzp.proupernutrition;

public class Dishes {

    private String dish;
    private String components;
    private String country;
    private String author;
    private String cooking;

    public Dishes(String dish, String components, String country,
                  String author, String cooking) {
        this.dish = dish;
        this.components = components;
        this.country = country;
        this.author = author;
        this.cooking = cooking;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCooking() {
        return cooking;
    }

    public void setCooking(String cooking) {
        this.cooking = cooking;
    }

}