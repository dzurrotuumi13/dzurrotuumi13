/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176020pbo5;

/**
 *
 * @author Asus
 * Nama : Dzurrotu Umi Asyfiya
 * NIM : 23176020
 * Prodi : Sistem Informasi
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai Waktu saat ini
 */
import java.util.Scanner;

public class HurufBesarKecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);
       
    }
}
