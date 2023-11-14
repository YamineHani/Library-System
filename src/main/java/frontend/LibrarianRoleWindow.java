/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.LibrarianRole;
import backend.Book;
import backend.StudentBook;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yasmi
 */
public class LibrarianRoleWindow extends javax.swing.JFrame implements Node{
    private Node parent;
    public static LibrarianRole librarianRole;
    private AddBook ab;
    private View vb;
    private View vbb;
    private BorrowBook bb;
    private ReturnBook rb;
    /**
     * Creates new form LibrarianRoleWindow
     */
    public LibrarianRoleWindow() {
        initComponents();
        ab = new AddBook(); 
        librarianRole = new LibrarianRole();
        bb = new BorrowBook();
        rb = new ReturnBook();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBook = new javax.swing.JButton();
        viewBooks = new javax.swing.JButton();
        borrowBook = new javax.swing.JButton();
        viewBorrowedBooks = new javax.swing.JButton();
        returnBook = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Librarian role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        addBook.setBackground(new java.awt.Color(0, 0, 0));
        addBook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBook.setForeground(new java.awt.Color(255, 255, 255));
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        viewBooks.setBackground(new java.awt.Color(0, 0, 0));
        viewBooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewBooks.setForeground(new java.awt.Color(255, 255, 255));
        viewBooks.setText("View Books");
        viewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBooksActionPerformed(evt);
            }
        });

        borrowBook.setBackground(new java.awt.Color(0, 0, 0));
        borrowBook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        borrowBook.setForeground(new java.awt.Color(255, 255, 255));
        borrowBook.setText("Borrow Book");
        borrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBookActionPerformed(evt);
            }
        });

        viewBorrowedBooks.setBackground(new java.awt.Color(0, 0, 0));
        viewBorrowedBooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewBorrowedBooks.setForeground(new java.awt.Color(255, 255, 255));
        viewBorrowedBooks.setText("View Borrowed Books");
        viewBorrowedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBorrowedBooksActionPerformed(evt);
            }
        });

        returnBook.setBackground(new java.awt.Color(0, 0, 0));
        returnBook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnBook.setForeground(new java.awt.Color(255, 255, 255));
        returnBook.setText("Return Book");
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrowBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewBorrowedBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(returnBook, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(viewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
       this.parent = node;
    }
    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:]
        this.setVisible(false);
        ab.setParentNode(this);
        ab.setVisible(true);

    }//GEN-LAST:event_addBookActionPerformed

    private void viewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBooksActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        if (vb == null){
            vb = new View(new String[]{"Book Id","Title","Author Namw",
                "Publisher","No Of Copies"});
        }

        Book[ ]books = librarianRole.getListOfBooks();
        String [][] bookData  =
        new String[books.length][5];
        String str;
        for (int i = 0; i< books.length; i++ ){
            str = books[i].lineRepresentation();
            bookData[i] = str.split(",");
        }

        vb.setData(bookData);
        vb.setTitle("View books");
        vb.setParentNode(this);
        vb.setVisible(true);
    }//GEN-LAST:event_viewBooksActionPerformed

    private void borrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBookActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        bb.setParentNode(this);
        bb.setVisible(true);
      
    }//GEN-LAST:event_borrowBookActionPerformed

    private void viewBorrowedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBorrowedBooksActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);

        if (vbb == null){
            vbb = new View(new String[]{"Student Id",
                "Book Id","Borrow Date"});
        }

        StudentBook[ ]studentBooks = librarianRole.getListOfBorrowingOperations();
        String [][] studentBookData  =
        new String[studentBooks.length][3];
        String str;
        for (int i = 0; i< studentBooks.length; i++ ){
            str = studentBooks[i].lineRepresentation();
            studentBookData[i] = str.split(",");
        }

        vbb.setData(studentBookData);
        vbb.setTitle("View borrowed books");
        vbb.setParentNode(this);
        vbb.setVisible(true);
        
    }//GEN-LAST:event_viewBorrowedBooksActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        rb.setParentNode(this);
        rb.setVisible(true);
    }//GEN-LAST:event_returnBookActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        librarianRole.logout();
        ((JFrame)(getParentNode().getParentNode())).setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "You should Logout to exit");
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianRoleWindow().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JButton borrowBook;
    private javax.swing.JButton logout;
    private javax.swing.JButton returnBook;
    private javax.swing.JButton viewBooks;
    private javax.swing.JButton viewBorrowedBooks;
    // End of variables declaration//GEN-END:variables
}
