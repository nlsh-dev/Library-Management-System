package library_management_system;

import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }


    public void displayUserInfo() {
        System.out.println(
                "User ID: " + id +
                        " | Name: " + name +
                        " | Borrowed Books: " + borrowedBooks.size()
        );

    }

}
