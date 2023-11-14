/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author yasmi
 */
 class LibrarianUserDatabase extends Database{

    public LibrarianUserDatabase(String filename){
        super(filename);
    }
    @Override
    public  LibrarianUser createRecordFrom(String line){
        String [] values = line.split(",");
        return new LibrarianUser(values[0],values[1],values[2],values[3],values[4]);
    }

}
