package KomandroPertemuan2.src;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // deklarasi var
        String namaLengkap, namaPendek;
        int usia;

        // membuat scanner
        Scanner keyboard = new Scanner(System.in);


        System.out.println("halo selamat datang");
        System.out.println("silahkan datang di rental kami");

        System.out.print("Masukkan nama lengkap: ");
        namaLengkap = keyboard.nextLine();
        
        System.out.print("Masukkan nama pendek: ");
        namaPendek = keyboard.nextLine();
        
        System.out.print("Masukkan usia: ");
        usia = keyboard.nextInt();

        // menampilkan yang diimput
        System.out.println("======================");
        System.out.format("Nama lengkap: %s\n", namaLengkap);
        System.out.format("Nama pendek: %s\n", namaPendek);
        System.out.format("Nama pendek: %d\n", usia);
        
        keyboard.close();
    }
}
