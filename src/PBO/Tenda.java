package PBO;

import java.until.Scanner;

// Class Tenda sebagai superclass
public class Tenda {
    //atribut dan encapsulation
    private String namaTenda;
    private double hargaSewa;
  
   // Constructor untuk inisialisasi
 public Tenda(String namaTenda, double hargaSewa) {
    this.namaTenda = nama,Tenda;
    this.hargaSewa = hargaSewa;
}

//Method Accessor
public String getnamaTenda() {
    return namaTenda;
}

public double getHargaSewa() {
    return hargaSewa;
}

//Method Mutator
public void setNamaTenda(String namaTenda) {
    this.namaTenda = namaTenda;
}

public void setHargaSewa(double hargaSewa)  {
    this.hargaSewa = hargaSewa;
}

//Method untuk mencetak informasi tenda
public void cetakInto() {
    System.out.println("Nama Tenda: "+ namaTenda);
    System.out.println("Harga Sewa: "+ hargaSewa);
}

//Method untuk menghitung biaya sewa
public double hitungBiayaSewa(int lamaSewa) {
    return hargaSewa * lamaSewa;
  }
}