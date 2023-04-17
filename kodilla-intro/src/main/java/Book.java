public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book book = Book.of("Robert C. Martin", "Podręcznik dobrego programisty");
        System.out.println(book.author);
        System.out.println(book.title);
    }
}

