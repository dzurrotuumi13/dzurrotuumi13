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
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai Ejaan nama
 */
import java.util.Scanner;

public class EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = input.nextLine();

        System.out.println("Ejaan untuk \"" + nama + "\" adalah:");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
    }
}
