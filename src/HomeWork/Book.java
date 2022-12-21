package HomeWork;

public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book(String nameBook, int age, Author author) {
        this.nameBook = nameBook;
        this.year = age;
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", год выпуска: " + year + ", Автор: " + author;
    }

    @Override
    public boolean equals(Object book) {
        if (book == null || getClass() != book.getClass()) return false;
        Book that = (Book) book;
        return nameBook.equals(that.nameBook);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }

}
