/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import constants.FileNames;

/**
 *
 * 
 * @author yasmi
 */
public class AdminRole implements FileNames{
        
    private LibrarianUserDatabase database;
    public AdminRole(){
        database = new LibrarianUserDatabase(LIBRARIANS_FILENAME);
        database.readFromFile();
    }
    public void addLibrarian(String librarianId, String name, String email,
                             String address, String phoneNumber){
        database.insertRecord(new LibrarianUser(librarianId, name, email, address, phoneNumber));

    }
  
    public LibrarianUser[] getListOfLibrarians(){
        LibrarianUser[] arr = new LibrarianUser[database.returnAllRecords().size()];
        arr = database.returnAllRecords().toArray(arr);
        return  arr;
    }
    public void removeLibrarian(String key){
        database.deleteRecord(key);
    }
    public void logout(){
        database.saveToFile();
    }


}
