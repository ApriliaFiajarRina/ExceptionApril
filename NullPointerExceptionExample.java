/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APRILIAFIAJARRINA_22533637_PBO;

/**
 *
 * @author User
 */
public class NullPointerExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try {
            String str = null;
            int length = str.length(); // Null Pointer Exception terjadi di sini
        } catch (NullPointerException e) {
            System.out.println("Terjadi Null Pointer Exception: " + e.getMessage());
        }
    }
}
  
