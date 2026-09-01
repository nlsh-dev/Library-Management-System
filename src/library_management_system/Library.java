package library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<User> users;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    // Add a user to the library
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully: " + user.getName());
    }

    // Issue a book to a user
    public void issueBook(int bookId, int userId) {

        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.setAvailable(false);
        user.borrowBook(book);

        System.out.println(
                "Book \"" + book.getTitle() +
                        "\" issued to " + user.getName()
        );
    }

    // Return a book
    public void returnBook(int bookId, int userId) {

        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is already available in the library.");
            return;
        }

        book.setAvailable(true);
        user.returnBook(book);

        System.out.println(
                "Book \"" + book.getTitle() +
                        "\" returned by " + user.getName()
        );
    }

    // Find a book using its ID
    private Book findBookById(int bookId) {

        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // Find a user using their ID
    private User findUserById(int userId) {

        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }

        return null;
    }

    // Display all books
    public void displayBooks() {

        System.out.println("\n===== BOOKS =====");

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Display all users
    public void displayUsers() {

        System.out.println("\n===== USERS =====");

        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }

        for (User user : users) {
            user.displayUserInfo();
        }
    }
}