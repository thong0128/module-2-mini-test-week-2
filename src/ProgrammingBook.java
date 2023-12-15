public class ProgrammingBook extends Book{
    private String language = "none";
    private String framework = "none";

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String name, String author, String bookCode, int price, String language, String framework) {
        super(name, author, bookCode, price);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
