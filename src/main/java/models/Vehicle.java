package models;

public class Vehicle {
    private int year;
    private String brand;
    private String model;
    private int miles;
    private int price;

    public boolean worthBuying(int maxPrice){
        return (price < maxPrice);
    }

    public Vehicle(int year, String brand, String model, int miles, int price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.miles = miles;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMiles() {
        return miles;
    }
}