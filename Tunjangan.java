/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176020pbo5;

/**
 *
 * @author Asus
 * Nama             : Dzurrotu Umi Asyfiya   
 * NIM              : 23176020
 * Prodi            : Sistem Informasi
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai progam tunjangan
 */
import java.util.Scanner;

public class Tunjangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("=====Program Tunjangan=====");
        System.out.print("Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.next();

        double tunjangan = 0;

        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Nama  : " + nama);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Total Gaji  : Rp " + totalGaji);
       

        scanner.close();
    }
}

    

