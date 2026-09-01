package library_management_system;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        Library library = new Library();

        Book book1 = new Book(101, "Clean Code", "Robert C. Martin");
        Book book2 = new Book(102, "Effective Java", "Joshua Bloch");
        Book book3 = new Book(103, "Head First Java", "Kathy Sierra");

        User user1 = new User(1, "Neelesh");
        User user2 = new User(2, "Rahul");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addUser(user1);
        library.addUser(user2);

        library.displayBooks();
        library.displayUsers();


        System.out.println("\n===== ISSUING BOOKS =====");

        library.issueBook(101, 1);
        library.issueBook(102, 2);

        library.issueBook(101, 2);


        library.displayBooks();
        library.displayUsers();

        System.out.println("\n===== RETURNING BOOK =====");

        library.returnBook(101, 1);

        library.displayBooks();
        library.displayUsers();
    }
}