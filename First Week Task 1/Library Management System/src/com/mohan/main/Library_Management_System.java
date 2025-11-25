package com.mohan.main;

import java.util.Scanner;
import com.mohan.Library.Library;

public class Library_Management_System {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(); 

        while (true) {

            System.out.println("\n=== Welcome to My Library ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search by Title");
            System.out.println("4. Search by Author");
            System.out.println("5. Show All Books");
            System.out.println("6. Collect Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

            case 1:
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Author Name: ");
                String author = scanner.nextLine();
                library.addBook(title, author);
                break;

            case 2:
                System.out.print("Enter Book Title to Remove: ");
                String removeTitle = scanner.nextLine();
                library.removeBook(removeTitle);
                break;

            case 3:
                System.out.print("Enter Book Title to Search: ");
                String searchTitle = scanner.nextLine();
                library.searchBook_byTitle(searchTitle);
                break;

            case 4:
                System.out.print("Enter Author Name to Search: ");
                String searchAuthor = scanner.nextLine();
                library.searchBook_byAuthor(searchAuthor);
                break;

            case 5:
                library.displayBooks();
                break;

            case 6:
                System.out.print("Enter Book Title to Collect: ");
                String collectTitle = scanner.nextLine();
                library.collectingBook(collectTitle);
                break;

            case 7:
                System.out.print("Enter Book Title to Return: ");
                String returnTitle = scanner.nextLine();
                library.returnBook(returnTitle);
                break;

            case 8:
                System.out.println("Thank you for using the Library System!");
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

