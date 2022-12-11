package models;

public class BookInstance {

    String serialNumber;
    Book book;
    Branch branch;
    Boolean isOutOfStock; // kitab magazada var ya yox


    public BookInstance() {
    }

    public BookInstance(String serialNumber, Book book, Branch branch, Boolean isOutOfStock) {
        this.serialNumber = serialNumber;
        this.book = book;
        this.branch = branch;
        this.isOutOfStock = isOutOfStock;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Boolean getOutOfStock() {
        return isOutOfStock;
    }

    public void setOutOfStock(Boolean outOfStock) {
        isOutOfStock = outOfStock;
    }
}

