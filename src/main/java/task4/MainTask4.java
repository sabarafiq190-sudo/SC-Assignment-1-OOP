package task4;

public class MainTask4 {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert Martin");
        Member m1 = new Member("Ayesha", 101);
        Member m2 = new Member("Bilal", 102);

        m1.borrowBook(b1);
        m2.borrowBook(b1); // should fail - already borrowed
        m1.returnBook(b1);
        m2.borrowBook(b1); // now succeeds
    }
}
