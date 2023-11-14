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

 class StudentBookDatabase extends Database {

    public StudentBookDatabase(String fileName) {
        super(fileName);
    }
    @Override
    public StudentBook createRecordFrom(String line){
        String [] values = line.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.parse(values[2], formatter);
        return new StudentBook(values[0],values[1],ld);
    }

}

