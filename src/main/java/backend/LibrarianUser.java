/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author yasmi
 */
public class LibrarianUser implements Information {
    private String librarianId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public LibrarianUser(String librarianId, String name, String email, String address, String phoneNumber) {
        this.librarianId = librarianId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String lineRepresentation() {
        return librarianId + "," + name + "," + email + "," + address + "," + phoneNumber;
    }

    @Override
    public String getSearchKey() {
        return librarianId;
    }

}

