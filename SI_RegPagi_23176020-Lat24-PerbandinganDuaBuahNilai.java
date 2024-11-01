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
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai perbandingan dua buah nilai
 */
import java.util.Scanner;

public class PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("Tidak")) {
                break;
            }
        }
    }
}
