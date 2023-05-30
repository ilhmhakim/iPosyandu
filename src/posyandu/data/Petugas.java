package posyandu.data;

import java.security.PublicKey;
import java.util.Scanner;

public class Petugas {
    Scanner scan = new Scanner(System.in);
    String nama;
    WaktuTugas jadwal = new WaktuTugas();
    Vaksinasi vaksin = new Vaksinasi();

    public Petugas(){
        this.nama = " ";
    }

    public void setPetugas(){
        System.out.println("Masukkan Nama Petugas");
        this.nama = scan.nextLine();
        this.jadwal.setWaktuTugas();
    }

    public void printDataPetugas(){
        System.out.println("Nama Petugas : " + this.nama);
        System.out.println("Waktu Bertugas : " + this.jadwal.hari + ", " + this.jadwal.tanggal + " " + this.jadwal.bulan + " " + this.jadwal.tahun);
    }

    public void tambahVaksin(){
        vaksin.add();
    }

    public void cekStokVaksin(){
        vaksin.available();
    }

    public class WaktuTugas{
        int tanggal, tahun;
        String hari, bulan;

        public WaktuTugas(){
            this.hari = " ";
            this.tanggal = 0;
            this.bulan = " ";
            this.tahun = 0;
        }

        public void setWaktuTugas(){
            System.out.println("Masukkan Hari Bertugas (Misal, Senin) : ");
            this.hari = scan.nextLine();
            System.out.println("Masukkan Tanggal Bertugas (Misal, 16) : ");
            this.tanggal = scan.nextInt();
            scan.nextLine();
            System.out.println("Masukkan Bulan Bertugas (Misal, Juni) : ");
            this.bulan = scan.nextLine();
            System.out.println("Masukkan Tahun Bertugas (Misal, 2014) : ");
            this.tahun = scan.nextInt();
        }
    }
}






