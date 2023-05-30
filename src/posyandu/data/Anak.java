package posyandu.data;
import posyandu.logic.KMS;
import posyandu.logic.Meja;

import java.util.Scanner;


public class Anak{
    Scanner scan = new Scanner(System.in);
    protected String namaAnak, tempatTanggalLahir, jenisKelamin, namaOrtu, alamatRumah, statusPertumbuhan,
                    pemberianObatCacing, nomorHp, vaksinBCG, vaksinPolio, vaksinHepatitisB,
                    vaksinHiB, vaksinDPT, vaksinRotavirus, vaksinOCV, vaksinCampak;
    protected int NIK, beratBadan, tinggiBadan, usia;



    StatusVaksin statusVaksin = new StatusVaksin();

    MejaSatu mejaSatu = new MejaSatu();
    MejaDua mejaDua = new MejaDua();
    MejaTiga mejaTiga = new MejaTiga();
    MejaEmpat mejaEmpat = new MejaEmpat();
    MejaLima mejaLima = new MejaLima();

    public Anak(){
        this.NIK = 0;
        this.namaAnak = " ";
        this.tempatTanggalLahir = " ";
        this.usia = 0;
        this.jenisKelamin = " ";
        this.beratBadan = 0;
        this.tinggiBadan = 0;
        this.namaOrtu = " ";
        this.alamatRumah = " ";
        this.nomorHp = " ";
        this.statusPertumbuhan = "Belum Ada Data";
        this.pemberianObatCacing = "Obat Cacing Belum Diberikan";
        this.vaksinBCG = getVaksinBCG();
        this.vaksinPolio = getVaksinPolio();
        this.vaksinHepatitisB = getVaksinHepatitisB();
        this.vaksinHiB = getVaksinHiB();
        this.vaksinOCV = getVaksinOCV();
        this.vaksinRotavirus = getVaksinRotavirus();
        this.vaksinDPT = getVaksinDPT();
        this.vaksinCampak = getVaksinCampak();
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public void setNamaAnak() {
        this.namaAnak = scan.nextLine();
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir() {
        this.tempatTanggalLahir = scan.nextLine();
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin() {
        this.jenisKelamin = scan.nextLine();
    }

    public String getNamaOrtu() {
        return namaOrtu;
    }

    public void setNamaOrtu() {
        this.namaOrtu = scan.nextLine();
    }

    public String getAlamatRumah() {
        return alamatRumah;
    }

    public void setAlamatRumah() {
        this.alamatRumah = scan.nextLine();
    }

    public String getStatusPertumbuhan() {
        return statusPertumbuhan;
    }

    public void setStatusPertumbuhan(String statusPertumbuhan) {
        this.statusPertumbuhan = statusPertumbuhan;
    }

    public String getPemberianObatCacing() {
        return pemberianObatCacing;
    }

    public void setPemberianObatCacing(String statusPemberianObatCacing) {
        this.pemberianObatCacing = statusPemberianObatCacing;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp() {
        this.nomorHp = scan.nextLine();
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK() {
        this.NIK = scan.nextInt();
        scan.nextLine();
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan() {

        this.beratBadan = scan.nextInt();
        scan.nextLine();
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan() {this.tinggiBadan = scan.nextInt();}

    public int getUsia() {
        return usia;
    }

    public void setUsia() {
        this.usia = scan.nextInt();
        scan.nextLine();
    }

    public String getVaksinBCG() {
        return statusVaksin.getStatusVaksinBCG();
    }

    public String getVaksinPolio() {
        return statusVaksin.getStatusVaksinPolio();
    }

    public String getVaksinHepatitisB() {
        return statusVaksin.getStatusVaksinHepatitisB();
    }

    public String getVaksinHiB() {
        return statusVaksin.getStatusVaksinHiB();
    }

    public String getVaksinDPT() {
        return statusVaksin.getStatusVaksinDPT();
    }

    public String getVaksinRotavirus() {
        return statusVaksin.getStatusVaksinRotavirus();
    }

    public String getVaksinOCV() {
        return statusVaksin.getStatusVaksinOCV();
    }

    public String getVaksinCampak() {
        return statusVaksin.getStatusVaksinCampak();
    }

    public void menuju(){
        mejaSatu.action();
        mejaDua.action();
        mejaTiga.action();
        mejaEmpat.action();
        mejaLima.action();
    }


    public class MejaSatu implements Meja {
        public void action() {
            System.out.println("---------------------- Selamat Datang di Meja Satu ----------------------\n");

            System.out.println("Masukkan NIK Anak : ");
            setNIK();

            System.out.println("Masukkan Nama Anak : ");
            setNamaAnak();

            System.out.println("Masukkan Tempat dan Tanggal Lahir Anak : Jakarta, 20 April 2008 ");
            setTempatTanggalLahir();

            System.out.println("Masukkan Usia Anak (Bulan)");
            setUsia();

            System.out.println("Masukkan Jenis Kelamin Anak (L/P) : ");
            setJenisKelamin();

            System.out.println("Masukkan Nama Ibu dari Anak : ");
            setNamaOrtu();

            System.out.println("Masukkan Alamat Rumah : ");
            setAlamatRumah();

            System.out.println("Masukkan Nomor Handphone : ");
            setNomorHp();

            System.out.println();
        }
    }

    public class MejaDua implements Meja{
        public void action(){
            System.out.println();
            System.out.println("---------------------- Selamat Datang di Meja Dua ----------------------\n");
            System.out.println("Masukkan Tinggi Badan yang Terukur (cm)");
            setTinggiBadan();
            System.out.println();
            System.out.println("Masukkan Berat Badan yang Terukur (Kg)");
            setBeratBadan();
            System.out.println();
        }
    }

    public class MejaTiga implements Meja{
        KMS kms = new KMS();
        public void action() {
            System.out.println();
            System.out.println("---------------------- Selamat Datang di Meja Tiga ----------------------\n");
            System.out.println("\t\tPengecekan dan Pengisian KMS (Kartu Menuju Sehat)\n");
            System.out.println("1. Cek Berat dan Tinggi Anak");
            System.out.println("2. Cek dan Update Status Pertumbuhan Anak");
            String input3 = scan.nextLine();

            while(true){
                switch (input3){
                    case "1" :
                        System.out.println();
                        System.out.println("----- Status Anak -----\n");
                        System.out.println("Umur " + getUsia() + " bulan");
                        if (getJenisKelamin().equals("L")) {
                            System.out.println("Jenis Kelamin : Laki-laki");
                        } else if (getJenisKelamin().equals("P")) {
                            System.out.println("Jenis Kelamin : Perempuan");
                        }
                        System.out.println("Tinggi Badan " + getTinggiBadan() + " cm");
                        System.out.println("Berat Badan " + getBeratBadan() + " Kg");
                        System.out.println();
                        break;

                    case "2" :
                        System.out.println();
                        System.out.println("----- Cek Status Pertumbuhan Anak -----\n");
                        setStatusPertumbuhan(kms.cekKMS(getJenisKelamin(), getUsia(), getTinggiBadan(), getBeratBadan()));
                        System.out.println();
                        System.out.println("Status Pertumbuhan Anak : ");
                        System.out.println(getStatusPertumbuhan());
                        System.out.println();
                        break;
                }
                System.out.println();
                System.out.println("\t\tPengecekan dan Pengisian KMS (Kartu Menuju Sehat)\n");
                System.out.println("1. Cek Berat dan Tinggi Anak");
                System.out.println("2. Cek dan Update Status Gizi Anak");
                System.out.println("3. Lanjut ke Meja Berikutnya");
                input3 = scan.nextLine();

                if(input3.equals("3")){
                    break;
                }

            }
        }
    }

    public class MejaEmpat implements Meja{
        Artikel artikels = new Artikel();
        public void action(){
            System.out.println();
            System.out.println("---------------------- Selamat Datang di Meja Empat ----------------------\n");
            System.out.println("\t\tSesi Konsultasi Bersama");
            System.out.println();
            System.out.println("\t\tPilih Menu\n");
            System.out.println("1. Baca Artikel");

            String input4 = scan.nextLine();
            while (true){
                switch (input4){
                    case "1" :
                        System.out.println();
                        artikels.artikel();
                        break;
                    case "2" :
                        break;
                }
                System.out.println("\t\tPilih Menu\n");
                System.out.println("1. Baca Artikel");
                System.out.println("2. Lanjut ke Meja 5");

                input4 = scan.nextLine();

                if(input4.equals("2")){
                    break;
                }
            }


            }
        }

    public class MejaLima implements Meja{
        public void action(){
            System.out.println();
            System.out.println("---------------------- Selamat Datang di Meja Lima ----------------------\n");
            System.out.println("Vaksinasi dan Pemberian Obat Cacing");
            System.out.println();
            System.out.println("\t\tPilih Menu");
            System.out.println("1. Status Vaksinasi");
            System.out.println("2. Status Pemberian Obat Cacing");
            System.out.println("3. Lakukan Vaksinasi");
            System.out.println("4. Lakukan Pemberian Obat Cacing");
            String input5 = scan.nextLine();
            while(true){
                switch (input5){
                    case "1":
                        System.out.println();
                        System.out.println("------- Status Vaksinasi Anak -------\n");
                        statusVaksinasi();
                        System.out.println();
                    break;

                    case "2":
                        System.out.println();
                        System.out.println("------- Status Pemberian Obat Cacing -------\n");
                        System.out.println(getPemberianObatCacing());
                        System.out.println();
                    break;

                    case "3":
                        ambilVaksinasi();
                        System.out.println();
                    break;

                    case "4":
                        System.out.println();
                        System.out.println("------- Pemberian Obat Cacing -------\n");
                        pemberianObatCacing();
                        System.out.println("Obat Cacing Telah Diberikan");
                        System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("\t\tPilih Menu");
                System.out.println("1. Status Vaksinasi");
                System.out.println("2. Status Pemberian Obat Cacing");
                System.out.println("3. Lakukan Vaksinasi");
                System.out.println("4. Lakukan Pemberian Obat Cacing");
                System.out.println("5. Selesai");
                input5 = scan.nextLine();
                if(input5.equals("5")){
                    break;
                }
            }

        }

        public void pemberianObatCacing(){
            setPemberianObatCacing("Obat Cacing Telah Diberikan");
        }
        public void statusVaksinasi(){
            statusVaksin.status();
        }

        public void ambilVaksinasi(){
            statusVaksin.takeVac();
        }

        }
    }



