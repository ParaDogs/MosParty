package com.paradogs.mosparty.models;

public class Product {
    private String title;
    private String oldPrice;
    private String price;
    private String location;
    private String description;
    private String link;
    private String pathPhoto;

    public Product() {}

    public Product(String title, String oldPrice, String price, String location, String description, String link, String pathPhoto) {
        this.title = title;
        this.oldPrice = oldPrice;
        this.price = price;
        this.location = location;
        this.description = description;
        this.link = link;
        this.pathPhoto = pathPhoto;
    }

    public String getTitle() {
        return title;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public String getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getPathPhoto() {
        return pathPhoto;
    }
}
