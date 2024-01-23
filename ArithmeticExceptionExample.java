/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APRILIAFIAJARRINA_22533637_PBO;

/**
 *
 * @author User
 */
public class ArithmeticExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // Arithmetic Exception terjadi di sini
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Arithmetic Exception: " + e.getMessage());
        }
    }
}
    
    

