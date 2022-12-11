package models;

public class Author {
    int id;
    String authorName;

    public Author() {
    }

    public Author(int id, String authorName) {
        this.id = id;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nAuthorName: %s",
                this.getId(),
                this.getAuthorName());
    }
}
