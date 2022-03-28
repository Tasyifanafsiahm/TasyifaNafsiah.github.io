package data;
import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);  
        String Nama, Brand, namaProsesor, SO, jenisStorage;
        int Stok,jumlahCore, ukuran;
        
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Brand : "); Brand = masukan.nextLine();
        System.out.print("Nama Prosesor : "); namaProsesor = masukan.nextLine();
        System.out.print("Jumlah Core pada prosesor : "); jumlahCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Sistem Operasi : "); SO = masukan.nextLine();
        System.out.print("Ukuran RAM dalam GB: "); ukuran = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); jenisStorage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();
        masukan.close();
        
        System.out.println("=============================");
        
        Laptop spesifikasi = new Laptop(Nama, Brand, namaProsesor, jumlahCore, SO, ukuran, jenisStorage, Stok);
        spesifikasi.getAllLaptopData();
    }
}