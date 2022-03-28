package application;

import data.*;
import java.util.Scanner;
/**
 *
 * @author Tasyifa
 */
public class laptopapp {
    public static void main(String[] args) {
        String Nama, namaProsesor, SO, jenisStorage;
        int Stok, jumlahCore, ukuran;
        
        Scanner masukan = new Scanner(System.in);
        
        Asus pavilion15 = new Asus();
        Axioo inspire3 = new Axioo();
        
        pavilion15.AsusSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Nama Prosesor : "); namaProsesor = masukan.nextLine();
        System.out.print("Jumlah Core pada procesor : "); jumlahCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Sistem operasi: "); SO = masukan.nextLine();
        System.out.print("Ukuran RAM dalam GB: "); ukuran = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); jenisStorage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        pavilion15.setNama(Nama);
        pavilion15.setnamaProsesor(namaProsesor);
        pavilion15.setjumlahCore(jumlahCore);
        pavilion15.setSO(SO);
        pavilion15.setukuran(ukuran);
        pavilion15.setjenisStorage(jenisStorage);
        pavilion15.setStok(Stok);
        pavilion15.getAllLaptopData();
        System.out.println("Store Position " + pavilion15.getNama() + 
                " adalah " + pavilion15.getStorePositionLaptop());
        System.out.println("==========================================");
                
        inspire3.AxiooSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Nama Prosesor : "); namaProsesor = masukan.nextLine();
        System.out.print("Jumlah Core pada procesor : "); jumlahCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Sistem Operasi : "); SO = masukan.nextLine();
        System.out.print("Ukuran RAM dalam GB: "); ukuran = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); jenisStorage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        inspire3.setNama(Nama);
        inspire3.setnamaProsesor(namaProsesor);
        inspire3.setjumlahCore(jumlahCore);
        inspire3.setSO(SO);
        inspire3.setukuran(ukuran);
        inspire3.setjenisStorage(jenisStorage);
        inspire3.setStok(Stok);
        inspire3.getAllLaptopData();
        System.out.println("Store Position " + inspire3.getNama() + 
                " adalah " + inspire3.getStorePositionLaptop());
        System.out.println("==========================================");       
    }
}

