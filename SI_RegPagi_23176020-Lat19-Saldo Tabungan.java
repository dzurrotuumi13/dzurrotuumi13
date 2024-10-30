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
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai saldo Tabungan Bulanan
 */
public class Tabungan {

    public static void main(String[] args) {
        // Input
        double saldoAwal = 2500000;
        double bunga = 0.15; // 15%
        int lamaBulan = 6;

        // Perhitungan saldo setiap bulan
       for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp%,.0f\n", bulan, saldoAwal);
        }

       
    }
}
