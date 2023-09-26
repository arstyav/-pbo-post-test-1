/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;
import java.util.Scanner;

public class Posttest1 {
    public static void main(String[] args) {
        // Tambahkan beberapa data pembelian ke dalam ArrayList
        Pembelianbunga pembeli1 = new Pembelianbunga("Bellamy", "Mawar", 10, 250000);
        Pembelianbunga pembeli2 = new Pembelianbunga("Mark", "Lily", 5, 200000);
        Pembelianbunga pembeli3 = new Pembelianbunga("Aristy", "Tulip", 8, 900000);
        Pembelianbunga pembeli4 = new Pembelianbunga("Jay", "Anggrek", 12, 700000);
        Pembelianbunga pembeli5 = new Pembelianbunga("Arsheanne", "Melati", 7, 70000);
        
        ArrayList<Pembelianbunga> daftarPembelian = new ArrayList<>();
        daftarPembelian.add(pembeli1);
        daftarPembelian.add(pembeli2);
        daftarPembelian.add(pembeli3);
        daftarPembelian.add(pembeli4);
        daftarPembelian.add(pembeli5);
        
        // Tampilkan data pembelian menggunakan perulangan for
        System.out.println("Data Pembelian Bunga:");
        for (Pembelianbunga pembelian : daftarPembelian) {
            System.out.println("Pelanggan: " + pembelian.namaPelanggan + ", Jenis Bunga: " + pembelian.jenisBunga + ", Jumlah: " + pembelian.jumlahBunga + ", Harga Total: " + pembelian.hargaTotal);
        }
    }
}