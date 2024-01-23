/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APRILIAFIAJARRINA_22533637_PBO;

/**
 *
 * @author User
 */
public class IndexOutOfBoundsExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int index = 3;
            int value = arr[index]; // Index Out of Bound Exception terjadi di sini
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Terjadi Index Out of Bound Exception: " + e.getMessage());
        }
    }
}
    
    

