package com.paradogs.mosparty.models;

public class Shop {
    private final String title;
    private final String location;
    private final String pathPhoto;

    public Shop(String title, String location, String pathPhoto) {
        this.title = title;
        this.location = location;
        this.pathPhoto = pathPhoto;
    }

    public String getTitle() {
        return this.title;
    }

    public String getLocation() {
        return location;
    }

    public String getPathPhoto() {
        return pathPhoto;
    }
}
