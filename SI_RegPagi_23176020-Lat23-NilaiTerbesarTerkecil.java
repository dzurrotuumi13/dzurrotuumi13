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
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai Perhitungan nilai terbesar dan terkecil
 */
import java.util.Scanner;

public class NilaiTerbesarTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyakMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int[] nilaiMahasiswa = new int[banyakMahasiswa];
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        
        System.out.println("Petugas : " + namaPetugas);
       
    }
}
