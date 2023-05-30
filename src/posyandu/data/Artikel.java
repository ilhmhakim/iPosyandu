package posyandu.data;

import java.net.URI;
import java.util.Scanner;

public class Artikel {
    Scanner scan = new Scanner(System.in);

    public void artikel(){
        System.out.println("--------- Artikel yang Tersedia ---------\n");
        System.out.println("1. 4 Langkah Mudah Menstimulasi Kecerdasan Bayi");
        System.out.println("2. 7 Tips Merawat Bayi Baru Lahir yang Wajib Diketahui Ibu");
        System.out.println("3. Ini Kebutuhan Gizi Bayi Usia 0-12 Bulan yang Perlu Dicukupi");
        System.out.println("4. Panduan Lengkap Memenuhi Kebutuhan Gizi Bayi (Usia 0-11 Bulan)");
        System.out.println("5. Mengenal Apa itu Baby Blues Syndrome dan Cara Mengatasinya");

        String artikel = scan.nextLine();
        while (true){
            switch (artikel){
                case "1" :
                    try {
                        URI uri= new URI("https://www.alodokter.com/4-langkah-mudah-menstimulasi-kecerdasan-bayi");
                        java.awt.Desktop.getDesktop().browse(uri);
                        System.out.println("Selamat Membaca");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "2" :
                    try {
                        URI uri= new URI("https://www.alodokter.com/7-tips-merawat-bayi-baru-lahir-yang-wajib-diketahui-ibu");
                        java.awt.Desktop.getDesktop().browse(uri);
                        System.out.println("Selamat Membaca");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "3" :
                    try {
                        URI uri= new URI("https://www.siloamhospitals.com/informasi-siloam/artikel/kebutuhan-gizi-bayi");
                        java.awt.Desktop.getDesktop().browse(uri);
                        System.out.println("Selamat Membaca");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "4" :
                    try {
                        URI uri= new URI("https://hellosehat.com/parenting/bayi/gizi-bayi/kebutuhan-gizi-bayi/");
                        java.awt.Desktop.getDesktop().browse(uri);
                        System.out.println("Selamat Membaca");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "5" :
                    try {
                        URI uri= new URI("https://www.siloamhospitals.com/informasi-siloam/artikel/apa-itu-baby-blues-syndrome");
                        java.awt.Desktop.getDesktop().browse(uri);
                        System.out.println("Selamat Membaca");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
            System.out.println();
            System.out.println("--------- Artikel yang Tersedia ---------\n");
            System.out.println("1. 4 Langkah Mudah Menstimulasi Kecerdasan Bayi");
            System.out.println("2. 7 Tips Merawat Bayi Baru Lahir yang Wajib Diketahui Ibu");
            System.out.println("3. Ini Kebutuhan Gizi Bayi Usia 0-12 Bulan yang Perlu Dicukupi");
            System.out.println("4. Panduan Lengkap Memenuhi Kebutuhan Gizi Bayi (Usia 0-11 Bulan)");
            System.out.println("5. Mengenal Apa itu Baby Blues Syndrome dan Cara Mengatasinya");
            System.out.println("6. Berhenti Membaca Artikel");
            artikel = scan.nextLine();
            if(artikel.equals("6")){
                break;
            }
        }
    }
}
