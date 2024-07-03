/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Tariq Jamal
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionToDB con = new ConnectionToDB();
        con.establishConnection();
        User u = new User();
        u.getUserDetail("Emad", "abc");
      u.viewAllUsers();
//        userdisplayadm uda = new userdisplayadm(u);
//        uda.setVisible(true);
//        System.out.println(u.loginUser("Emad", "abc", "Admin"));
//        u.getUserDetail("Emad", "abc");
            Request r = new Request(u);
            r.setVisible(true);
    }

}
