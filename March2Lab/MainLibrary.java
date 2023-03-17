package March2Lab;

public class MainLibrary {
    public static void main(String[] args) {
        Library l = new Library();

        l.setBookId1(74672);
        l.setBookName1("Sapiens");
        l.setBookAuthor1("Yuval Noah Harari");

        System.out.println("Book Id: "+l.getBookId1());
        System.out.println("Book Name: "+l.getBookName1());
        System.out.println("BookAuthor: "+l.getBookAuthor1());

        l.setBookId2(32327);
        l.setBookName2("Jane Eyre");
        l.setBookAuthor2("Charlotte Bronte");

        System.out.println("Book Id: "+l.getBookId2());
        System.out.println("Book Name: "+l.getBookName2());
        System.out.println("BookAuthor: "+l.getBookAuthor2());
    }
}