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
    public static int countJavaBooks(Book[][] arr, String language) {
        int count = 0;
        for (Book[] bookType : arr){
            if (bookType instanceof ProgrammingBook[]){
                for (Book book : bookType){
                    ProgrammingBook refBook = (ProgrammingBook)book;
                    String thisLanguage = refBook.getLanguage();
                    if (thisLanguage.equals(language)){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static int countFiction1Books(Book[][] arr,String category) {
        int count = 0;
        for (Book[] bookType : arr){
            if (bookType instanceof FictionBook[]){
                for (Book book : bookType){
                    FictionBook refBook = (FictionBook)book;
                    String language = refBook.getCategory();
                    if (language.equals(category)){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static int countFictionMoreThanPrice(Book[][] arr, int price) {
        int count = 0;
        for (Book[] bookType : arr){
            if (bookType instanceof FictionBook[]){
                for (Book book : bookType){
                    FictionBook refBook = (FictionBook)book;
                    int thisPrice = refBook.getPrice();
                    if (thisPrice > price){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static int totalPrice1(Book[] arr) {
        int totaPrice = 0;
        for (Book book : arr) {
                totaPrice += book.getPrice();
        }
        return totaPrice;
    }
    public static int countJavaBooks1(Book[] arr, String language) {
        int count = 0;
        for (Book book : arr){
            if (book instanceof ProgrammingBook){
                    ProgrammingBook refBook = (ProgrammingBook)book;
                    String thisLanguage = refBook.getLanguage();
                    if (thisLanguage.equals(language)) count ++;
            }
        }
        return count;
    }
    public static int countFiction1Books1(Book[] arr, String category) {
        int count = 0;
        for (Book book : arr){
            if (book instanceof FictionBook){
                    FictionBook refBook = (FictionBook)book;
                    String language = refBook.getCategory();
                    if (language.equals(category)) count ++;
            }
        }
        return count;
    }
    public static int countFictionMoreThanPrice1(Book[] arr, int price) {
        int count = 0;
        for (Book book : arr){
            if (book instanceof FictionBook){
                FictionBook refBook = (FictionBook)book;
                int thisPrice = refBook.getPrice();
                if (thisPrice > price) count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

//        Method 1

        Book[][] myBooks = {new ProgrammingBook[5], new FictionBook[5]};
        Book book1 = myBooks[0][0] = new ProgrammingBook("Head First Java"
                , "Kathy Sierra"
                , "001"
                , 41
                , "java"
                , "any");
        Book book2 = myBooks[0][1]  = new ProgrammingBook("Spring in Action"
                , "Craig Walls and Ryan Breidenbach"
                , "002"
                , 39
                , "java"
                , "Spring");
        Book book3 = myBooks[0][2] = new ProgrammingBook("Effective Java"
                , "Joshua Bloch"
                , "003"
                , 42
                , "java"
                , "any");
        Book book4 = myBooks[0][3] = new ProgrammingBook("Object-Oriented Frameworks Using C++ and CORBA Gold Book"
                , "Vishwajit Aklecha"
                , "004"
                , 8
                , "C++"
                , "CORBA");
        Book book5 = myBooks[0][4] = new ProgrammingBook("Flask Web Development"
                , "Miguel Grinberg"
                , "005"
                , 35
                , "Python"
                , "Flask");
        Book book6 = myBooks[1][0] = new FictionBook("The Heaven & Earth Grocery Store: A Novel"
                , "James McBride"
                , "006"
                , 17
                , "friction 1");
        Book book7 = myBooks[1][1] = new FictionBook("Holly"
                , "Stephen King"
                , "007"
                , 160
                , "friction 2");
        Book book8 = myBooks[1][2] = new FictionBook("A Court of Thorns and Roses"
                , "Sarah J. Maas"
                , "008"
                , 50
                , "friction 2");
        Book book9 = myBooks[1][3] = new FictionBook("Lessons in Chemistry: A Novel"
                , "Bonnie Garmus"
                , "009"
                , 200
                , "friction 1");
        Book book10 = myBooks[1][4] = new FictionBook("The Covenant of Water (Oprah's Book Club)"
                , "Abraham Verghese"
                , "010"
                , 30
                , "friction 3");
        method1Test(myBooks);

//        Method 2

        Book[] myBooks1 = new Book[10];
        myBooks1[0] = new ProgrammingBook("Head First Java"
                , "Kathy Sierra"
                , "001"
                , 41
                , "java"
                , "any");
        myBooks1[1] = new ProgrammingBook("Spring in Action"
                , "Craig Walls and Ryan Breidenbach"
                , "002"
                , 39
                , "java"
                , "Spring");
        myBooks1[2] = new ProgrammingBook("Effective Java"
                , "Joshua Bloch"
                , "003"
                , 42
                , "java"
                , "any");
        myBooks1[3] = new ProgrammingBook("Object-Oriented Frameworks Using C++ and CORBA Gold Book"
                , "Vishwajit Aklecha"
                , "004"
                , 8
                , "C++"
                , "CORBA");
        myBooks1[4] = new ProgrammingBook("Flask Web Development"
                , "Miguel Grinberg"
                , "005"
                , 35
                , "Python"
                , "Flask");
        myBooks1[5] = new FictionBook("The Heaven & Earth Grocery Store: A Novel"
                , "James McBride"
                , "006"
                , 17
                , "friction 1");
        myBooks1[6] = new FictionBook("Holly"
                , "Stephen King"
                , "007"
                , 160
                , "friction 2");
        myBooks1[7] = new FictionBook("A Court of Thorns and Roses"
                , "Sarah J. Maas"
                , "008"
                , 50
                , "friction 2");
        myBooks1[8] = new FictionBook("Lessons in Chemistry: A Novel"
                , "Bonnie Garmus"
                , "009"
                , 200
                , "friction 1");
        myBooks1[9] = new FictionBook("The Covenant of Water (Oprah's Book Club)"
                , "Abraham Verghese"
                , "010"
                , 30
                , "friction 3");
        method2Test(myBooks1);

//        Comparison

        System.out.println("Comparing...");

        long startTime, endTime, elapsedTime;

        startTime = System.nanoTime();

        method1Test(myBooks);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");

        startTime = System.nanoTime();

        method2Test(myBooks1);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }

    private static void method1Test(Book[][] myBooks) {
        System.out.println("Total price of your book: " + totalPrice(myBooks));
        System.out.println("There is " + countJavaBooks(myBooks, "java") + " books with java language");
        System.out.println("There is " + countFiction1Books(myBooks, "friction 1") + " fiction books with category 'friction 1'");
        System.out.println("There is " + countFictionMoreThanPrice(myBooks, 100) + " fiction books with price more than 100");
    }

    private static void method2Test(Book[] myBooks1) {
        System.out.println("Total price of your book: " + totalPrice1(myBooks1));
        System.out.println("There is " + countJavaBooks1(myBooks1, "java") + " books with java language");
        System.out.println("There is " + countFiction1Books1(myBooks1, "friction 1") + " fiction books with category 'friction 1'");
        System.out.println("There is " + countFictionMoreThanPrice1(myBooks1, 100) + " fiction books with price more than 100");
    }
}
