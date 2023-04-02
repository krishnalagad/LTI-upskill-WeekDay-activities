package Problem5_DistinctObjects;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of Books");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Book> books = new ArrayList<>();
        System.out.println("Enter the book details in CSV format");
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            String title = tokens[0];
            String category = tokens[1];
            String author = tokens[2];
            Double price = Double.parseDouble(tokens[3]);
            Book book = new Book(title, category, author, price);
            books.add(book);
        }

        List<Book> distinctBooks = books.stream()
                .filter(distinctByKey(Book::getTitle))
                .collect(Collectors.toList());

        System.out.println("List of Distinct Books");
        System.out.format("%-20s %-20s %-10s %s\n", "Title", "Category", "Author", "Price");
        for (Book book : distinctBooks) {
            System.out.format("%-20s %-20s %-10s %s\n",
                    book.getTitle(), book.getCategory(), book.getAuthor(), book.getPrice());
        }
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}