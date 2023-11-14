/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author yasmi
 */
import constants.FileNames;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class LibrarianRole implements FileNames{
    private BookDatabase bookDatabase;
    private StudentBookDatabase sBDatabase;

    public LibrarianRole() {
        bookDatabase = new BookDatabase(BOOKS_FILENAME);
        sBDatabase = new StudentBookDatabase(STUDENTSBOOKS_FILENAME);
        bookDatabase.readFromFile();
        sBDatabase.readFromFile();
    }

    public void addBook(String id, String title, String authorName, String
            publisherName, int quantity) {
        bookDatabase.insertRecord(new Book(id, title, authorName, publisherName, quantity));
    }

    public Book[] getListOfBooks() {
        Book[] arr = new Book[bookDatabase.returnAllRecords().size()];
        arr = bookDatabase.returnAllRecords().toArray(arr);
        return arr;
    }

    public StudentBook[] getListOfBorrowingOperations() {
        StudentBook[] arr = new StudentBook[sBDatabase.returnAllRecords().size()];
        arr = sBDatabase.returnAllRecords().toArray(arr);
        return arr;
    }

    public int borrowBook(String studentId, String bookId, LocalDate borrowDate) {
        if (sBDatabase.contains(studentId + "," + bookId))
            return 1;
        else if (bookDatabase.contains(bookId) == false )
            return 3;
       else if (((Book)bookDatabase.getRecord(bookId)).getQuantity() == 0)
            return 0;
        else {
            int newQuantity = ((Book)bookDatabase.getRecord(bookId)).getQuantity() - 1;
            ((Book)bookDatabase.getRecord(bookId)).setQuantity(newQuantity);
            sBDatabase.insertRecord(new StudentBook(studentId, bookId, borrowDate));
            return 2;
        }

    }

    public double returnBook(String studentId, String bookId, LocalDate returnDate) {
        int newQuantity = ((Book)bookDatabase.getRecord(bookId)).getQuantity() + 1;
        ((Book)bookDatabase.getRecord(bookId)).setQuantity(newQuantity);
        StudentBook sb = (StudentBook) sBDatabase.getRecord(studentId + "," + bookId);
        long lateDays = Math.abs(ChronoUnit.DAYS.between(returnDate,sb.getBorrowDate()));
        sBDatabase.deleteRecord(studentId + "," + bookId);
        if (lateDays > 7)
            return (lateDays - 7) * 0.5;
        else
            return 0;

    }

    public void logout() {
        bookDatabase.saveToFile();
        sBDatabase.saveToFile();
    }


}