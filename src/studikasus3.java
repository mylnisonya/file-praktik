/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
 *
 * @author Endang
 */
public class studikasus3 {
     public static void main(String[] args) {
        Scanner inputnya = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String namaku = inputnya.nextLine();
        
        System.out.print("No. Telepon: ");
        String nomerku = inputnya.nextLine();
         
        System.out.println("Halo, " + namaku);
        System.out.println("nomer telepon kamu: " + nomerku);
    }   
}
