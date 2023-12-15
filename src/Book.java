public class Book {
    private String name = "book";
    private String author = "none";
    private String bookCode = "000";
    private int price = 0;


    public Book() {
    }

    public Book(String name, String author, String bookCode, int price) {
        this.name = name;
        this.author = author;
        this.bookCode = bookCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
