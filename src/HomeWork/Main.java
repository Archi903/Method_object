package HomeWork;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Кэти ", "Сьерра");
        Book book1 = new Book("Java", 2012, author1);
        System.out.println(book1);

        book1.setYear(2002);
        System.out.println(book1);


        Author author2 = new Author("Лев ", "Толстой");
        Book book2 = new Book("Война и мир", 1873, author2);
        System.out.println(book2);

        Author author3 = new Author("Лев ", "Толстой");
        Book book3 = new Book("Мертвые души", 1873, author3);

        System.out.println(book3);
        System.out.println(author3.equals(author2));
        System.out.println(book2.equals(book3));

    }
}
