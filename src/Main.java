public class Main {
    public static int totalPrice(Book[][] arr) {
        int totaPrice = 0;
        for (Book[] bookType : arr) {
            for (Book book : bookType) {
                totaPrice += book.getPrice();
            }
        }
        return totaPrice;
    }
    public static int countJavaBooks(Book[][] arr) {
        int count = 0;
        for (Book[] bookType : arr){
            if (bookType instanceof ProgrammingBook[]){
                for (Book book : bookType){
                    ProgrammingBook refBook = (ProgrammingBook)book;
                    String language = refBook.getLanguage();
                    if (language.equals("java")){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static int countFiction1Books(Book[][] arr) {
        int count = 0;
        for (Book[] bookType : arr){
            if (bookType instanceof FictionBook[]){
                for (Book book : bookType){
                    FictionBook refBook = (FictionBook)book;
                    String language = refBook.getCategory();
                    if (language.equals("friction 1")){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static int count100MoreFiction(Book[][] arr) {
        int count = 0;
        for (Book[] bookType : arr){
            if (bookType instanceof FictionBook[]){
                for (Book book : bookType){
                    FictionBook refBook = (FictionBook)book;
                    int price = refBook.getPrice();
                    if (price>100){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Book[][] myBooks = {new ProgrammingBook[5], new FictionBook[5]};
        myBooks[0][0] = new ProgrammingBook("Head First Java"
                , "Kathy Sierra"
                , "001"
                , 41
                , "java"
                , "any");
        myBooks[0][1]  = new ProgrammingBook("Spring in Action"
                , "Craig Walls and Ryan Breidenbach"
                , "002"
                , 39
                , "java"
                , "Spring");
        myBooks[0][2] = new ProgrammingBook("Effective Java"
                , "Joshua Bloch"
                , "003"
                , 42
                , "java"
                , "any");
        myBooks[0][3] = new ProgrammingBook("Object-Oriented Frameworks Using C++ and CORBA Gold Book"
                , "Vishwajit Aklecha"
                , "004"
                , 8
                , "C++"
                , "CORBA");
        myBooks[0][4] = new ProgrammingBook("Flask Web Development"
                , "Miguel Grinberg"
                , "005"
                , 35
                , "Python"
                , "Flask");
        myBooks[1][0] = new FictionBook("The Heaven & Earth Grocery Store: A Novel"
                , "James McBride"
                , "006"
                , 17
                , "friction 1");
        myBooks[1][1] = new FictionBook("Holly"
                , "Stephen King"
                , "007"
                , 160
                , "friction 2");
        myBooks[1][2] = new FictionBook("A Court of Thorns and Roses"
                , "Sarah J. Maas"
                , "008"
                , 50
                , "friction 2");
        myBooks[1][3] = new FictionBook("Lessons in Chemistry: A Novel"
                , "Bonnie Garmus"
                , "009"
                , 200
                , "friction 1");
        myBooks[1][4] = new FictionBook("The Covenant of Water (Oprah's Book Club)"
                , "Abraham Verghese"
                , "010"
                , 30
                , "friction 3");
        System.out.println("Total price of your book: " + totalPrice(myBooks));
        System.out.println("There is " + countJavaBooks(myBooks) + " books with java language");
        System.out.println("There is " + countFiction1Books(myBooks) + " fiction books with category 'friction 1'");
        System.out.println("There is " + count100MoreFiction(myBooks) + " fiction books with price more than 100");
    }
}