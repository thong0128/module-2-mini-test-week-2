public class FictionBook extends Book{
    private String category = "none";

    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String name, String author, String bookCode, int price, String category) {
        super(name, author, bookCode, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
