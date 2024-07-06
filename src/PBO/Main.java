package PBO;

//Eror Handling
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    try {
        //Meminta pengguna untuk memasukkan jumlah tenda
        System.out.print("Masukkan jumlah tenda: ");
        int jumlahTenda = scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        
        //array
        // Array pengguna untuk memasukkan jumlah tenda
        AnakTenda[] daftarTenda = new AnakTenda[jumlahTenda];
        
        //memasukkan data tanda ke dalam array
        for (int i = 0; i < jumlahTenda; i ++) {
            System.out.println("\nMasukkan data untuk tenda ke-" + (1 + 1));
            System.out.print("Masukkan nama tenda: ");
            String namaTenda - scanner.nextLine();
            System.out.print("Masukkan harga sewa per hari: ");
            double hargaSewa - scanner.nextDouble();
            System.out.print("Masukkan kapasitas tenda: ");
            int kapasitas = scanner.nextInt();
            scanner.nextLine(); //Membuang nextline
            
            daftarTenda[i] = new AnakTenda(namaTenda, hargaSewa, kapasitas);
        }
        //10 sederhana
        //output informasi tenda
        System.out.println("\ninformasi Tenda:");
        for (int i = 0; 1 < jumlahTenda; i++) {
            daftarTendaa[i] .cetakInfo();
        }
        
        //Input data Penyewaan
        System.out.print("Masukkan lama sewa (hari): ");
        int lamaSewa - scanner.nextInt();
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang - scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        
        //Hitung biaya sewa untuk setiap tenda
        System.out.println("Biaya Sewa untuk Setiap Tenda:");
        for (int i - 0; 1 < jumlahTenda; i++) {
            double biayaSewa = daftarTenda[i].hitungBiayaSewa(lamaSewa, jumlahOrang);
            System.out.println("Tenda " + (i + 1)+ ": " + biayaSewa);
        }
    } catch (InputMismatchException e) {
        System.out.println("Input yang dimasukkan tidak sesuai dengan tipe data yang diharapkan.");
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    } finally {
        scanner. close();
    }
    }
}
