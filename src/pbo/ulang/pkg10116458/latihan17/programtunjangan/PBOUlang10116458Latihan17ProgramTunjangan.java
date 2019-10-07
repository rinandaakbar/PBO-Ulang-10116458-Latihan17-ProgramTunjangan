/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author nanda
 */
public class PBOUlang10116458Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String status;        
        double gajiPokok;  
        double tunjangan = 0;
        double totalGaji;
        String status1 = "Menikah";
        String status2 = "Belum";
                
        System.out.println("==========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. " );
        Scanner sc = new Scanner (System.in); 
        gajiPokok = sc.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)     : " );
        Scanner sc1 = new Scanner (System.in);
        status = sc1.next();

        System.out.println("\n"+"======Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok\t : Rp. " + gajiPokok);
        if (status.equals(status1)) {
            tunjangan = gajiPokok * 0.35;
            System.out.println("Tunjangan\t : Rp. " + tunjangan);
        }else {
            System.out.println("Tunjangan\t : Rp. " + tunjangan);
        }
        totalGaji = gajiPokok + tunjangan;
        System.out.println("---------------------------------- + ");
        System.out.println("Total Gaji\t : Rp. " + totalGaji);
    }
    
}
