public class Book {
    private final String title;
    private final Author author;
    private int yearRelease;

    public Book(String title, Author author, int yearRelease) {
        this.title = title;
        this.author = author;
        this.yearRelease = yearRelease;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
