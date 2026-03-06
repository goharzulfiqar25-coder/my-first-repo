// Name: Zulfiqar Gauhar
// SAP ID: 76579

class Student {
    int studentId;
    String studentName;

    Student(int id, String name) {
        studentId = id;
        studentName = name;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
    }
}

class Book {
    int bookId;
    String bookTitle;
    String authorName;
    boolean isIssued;
    Student issuedTo;

    Book(int id, String title, String author) {
        bookId = id;
        bookTitle = title;
        authorName = author;
        isIssued = false;
    }

    void issueBook(Student student) {
        if (!isIssued) {   // Corrected condition
            isIssued = true;
            issuedTo = student;
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
    }

    void displayIssueDetails() {
        if (isIssued) {
            System.out.println("\n--- Issue Details ---");
            displayBook();
            System.out.println("Issued To:");
            issuedTo.displayStudent();
        } else {
            System.out.println("Book is not issued.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Student s1 = new Student(76579, "Zulfiqar Gauhar");
        Book b1 = new Book(1, "Java Programming", "James Gosling");

        s1.displayStudent();
        System.out.println();

        b1.displayBook();
        System.out.println();

        b1.issueBook(s1);
        b1.displayIssueDetails();
    }
}