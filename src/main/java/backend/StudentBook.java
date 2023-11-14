/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author yasmi
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentBook implements Information {
    private String studentId;
    private String bookId;
    private LocalDate borrowDate;
    public StudentBook(String studentId, String bookId, LocalDate borrowDate){
        this.studentId = studentId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }

    public  String getStudentId(){
        return studentId;
    }
    public LocalDate getBorrowDate(){
        return borrowDate;
    }
    public String getBookId(){
        return bookId;
    }
    @Override
    public String lineRepresentation(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = borrowDate.format(formatter);
        return studentId+","+bookId+","+dateString;
    }
    @Override
    public String getSearchKey() {
        return studentId+","+bookId;
    }

}

