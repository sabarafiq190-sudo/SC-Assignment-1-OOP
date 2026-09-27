package task4;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Only Book itself controls how its availability changes
    public boolean markBorrowed() {
        if (!isAvailable) {
            return false; // already taken, refuse silently
        }
        isAvailable = false;
        return true;
    }

    public void markReturned() {
        isAvailable = true;
    }
}