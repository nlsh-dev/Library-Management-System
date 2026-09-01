package library_management_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean running = true;

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        while (running) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Display Books");
            System.out.println("4. Display Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();

                    User user = new User(userId, name);
                    library.addUser(user);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    library.displayUsers();
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int issueBookId = scanner.nextInt();

                    System.out.print("Enter User ID: ");
                    int issueUserId = scanner.nextInt();

                    library.issueBook(issueBookId, issueUserId);
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    int returnBookId = scanner.nextInt();

                    System.out.print("Enter User ID: ");
                    int returnUserId = scanner.nextInt();

                    library.returnBook(returnBookId, returnUserId);
                    break;

                case 7:
                    running = false;
                    System.out.println("\nThank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}