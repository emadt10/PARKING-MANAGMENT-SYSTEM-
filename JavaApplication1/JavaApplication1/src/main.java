/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(245, "Shehryar", 5000);
        BankAccount b2 = new BankAccount(245, "Sameen", 25000);
        BankAccount b3 = new BankAccount(245, "Shehnaz", 100000);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        b1.credit(5000);
        System.out.println(b1.toString());

    }
}
