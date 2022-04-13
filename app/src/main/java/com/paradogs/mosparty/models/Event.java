package com.paradogs.mosparty.models;

public class Event {
    private final String title;
    private final String dateStart;
    private final String dateEnd;
    private final String location;
    private final Integer price;
    private final String organizer;
    private final String link;
    private final String contacts;
    private final Boolean isOnline;
    private final String description;
    private final String pathPhoto;


    public Event(String title, String dateStart, String dateEnd, String location,
                 Integer price, String organizer, String link, String contacts,
                 Boolean isOnline, String description, String pathPhoto) {
        this.title = title;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
        this.price = price;
        this.organizer = organizer;
        this.link = link;
        this.contacts = contacts;
        this.isOnline = isOnline;
        this.description = description;
        this.pathPhoto = pathPhoto;
    }

    public String getTitle() {
        return title;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getLocation() {
        return location;
    }

    public Integer getPrice() {
        return price;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getLink() {
        return link;
    }

    public String getContacts() {
        return contacts;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public String getDescription() {
        return description;
    }

    public String getPathPhoto() {
        return pathPhoto;
    }
}
