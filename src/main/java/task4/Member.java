package task4;

public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {
        if (book.markBorrowed()) {
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        book.markReturned();
        System.out.println(name + " returned " + book.getTitle());
    }
}