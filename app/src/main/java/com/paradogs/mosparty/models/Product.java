package com.paradogs.mosparty.models;

public class Product {
    private final String title;
    private final Integer oldPrice;
    private final Integer price;
    private final String location;
    private final String description;
    private final String link;
    private final String pathPhoto;

    public Product(String title, Integer oldPrice, Integer price, String location,
                   String description, String link, String pathPhoto) {
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

    public Integer getOldPrice() {
        return oldPrice;
    }

    public Integer getPrice() {
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
