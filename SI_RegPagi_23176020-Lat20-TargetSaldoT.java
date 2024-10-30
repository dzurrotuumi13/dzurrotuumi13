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
 * Deskripsi Program: Rangkaian kode berikut berisi mengenai Target Saldo Tabungan Bulanan
 */
public class TargetSaldoT {
  

    public static void main(String[] args) {
        // Input
        double saldoAwal = 3500000;
        double bungaPerBulan = 0.08; // Bunga 8% diubah ke desimal
        double saldoTarget = 6000000;

        // Perhitungan
        int bulan = 0;
        double saldo = saldoAwal;
        while (saldo < saldoTarget) {
            bulan++;
            saldo += saldo * bungaPerBulan;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + String.format("%.0f", saldo));
        }
        }
    }
 

