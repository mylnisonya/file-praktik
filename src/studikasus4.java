/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
 *
 * @author Endang
 */
public class studikasus4 { 
       
    public static void main(String[] args) {
         Scanner angka = new Scanner(System.in
                
        System.out.print("Harga barang: ");
        double harga = angka.nextDouble();
        
        System.out.print("Jumlah barang: ");
        int jumlah = angka.nextInt();
        
        System.out.print("Diskon (%): ");
        double diskon = angka.nextDouble();
        
        double bayar = harga*jumlah;
        double potongan = bayar*diskon/100;
        double total = bayar-potongan;
        
        System.out.println("Total: " + total) );
    }   
    
    
}
