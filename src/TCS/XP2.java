package TCS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class XP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfBooks = scanner.nextInt();

        Book[] books = new Book[numOfBooks];

        for (int i = 0; i < numOfBooks; i++) {
            int id = scanner.nextInt();
            int pages = scanner.nextInt();
            scanner.nextLine();
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            double price = scanner.nextDouble();
            books[i] = new Book(id, pages, title, author, price);
        }
        scanner.nextLine();
        String choice = scanner.nextLine();

        Book res1 = findBookWithMaximumPrice(books);
        System.out.println(res1 != null ?
                "id-" + res1.getId() + "\n" +
                        "pages-" + res1.getPages() + "\n" +
                        "title-" + res1.getTitle() + "\n" +
                        "author-" + res1.getAuthor() + "\n" +
                        "price-" + res1.getPrice() :
                "No Book found with mentioned attribute"
        );
        Book res2 = searchBookByTitle(books, choice);
        System.out.println(res2 != null ?
                "id-" + res2.getId() + "\n" +
                        "pages-" + res2.getPages() + "\n" +
                        "title-" + res2.getTitle() + "\n" +
                        "author-" + res2.getAuthor() + "\n" +
                        "price-" + res2.getPrice() :
                "No Book found with mentioned attribute"
        );
    }

    public static Book findBookWithMaximumPrice(Book[] book) {
        return Arrays.stream(book)
                .max(Comparator.comparingDouble(Book::getPrice))
                .orElseThrow(null);
    }

    public static Book searchBookByTitle(Book[] book, String title) {
        Book res = null;
        for (Book b :
                book) {
            if (b.getTitle().equals(title))
                res = b;
        }
        return res;
    }
}

class Book {
    private final int id;
    private final int pages;
    private final String title;
    private final String author;
    private final double price;

    public Book(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
