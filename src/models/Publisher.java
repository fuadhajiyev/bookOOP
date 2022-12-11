package models;

public class Publisher {
    int id;
    String publisherName;

    public Publisher() {
    }

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nPublisherName: %s",
                this.getId(),
                this.getPublisherName());
    }
}
