/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author yasmi
 */


 class BookDatabase extends Database{
    public BookDatabase(String filename){
        super(filename);
    }
    @Override
    public Book createRecordFrom(String line){
        String [] values = line.split(",");
        return new Book(values[0], values[1], values[2], values[3], Integer.parseInt(values[4])) ;
    }
}
