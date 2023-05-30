package posyandu.app;
import posyandu.data.Anak;
import posyandu.data.Petugas;
import posyandu.logic.Queue;
import java.util.ArrayList;
import java.util.Scanner;

public class PosyanduApp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String role, input;
        Petugas petugas = new Petugas();
        ArrayList<Anak> array = new ArrayList<>();
        Queue antrian = new Queue(100);
        int nomorAntrian = 0;

        System.out.println("\t\t\ti-Posyandu Management System Start!");
        System.out.println("\t\t\t\t\tBy Clever Code");
        System.out.println("\t\t\t\tMuhammad Ilham Hakim Suherman");
        System.out.println("\t\t\t\tMuhammad Ferdinanta");
        System.out.println("\t\t\t\tMuhammad Aulia Dzikri");
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println("\t\t\tMENU\t\t\t\n");
        System.out.println("1. Petugas Posyandu");
        System.out.println("2. Ambil Nomor Antrian");
        role = scan.nextLine();
        System.out.println("=========================================================================================");
        while(true) {
            switch (role) {
                case "1":
                    petugas.setPetugas();
                    System.out.println();
                    System.out.println("--------------- Selamat Datang Petugas i-Posyandu ! ---------------\n");
                    System.out.println("Data Petugas Posyandu : \n");
                    petugas.printDataPetugas();
                    System.out.println();
                    System.out.println("--------------- Menu Petugas i-Posyandu ---------------\n");
                    System.out.println("1. Cek Kesediaan Vaksin");
                    System.out.println("2. Tambah Stok Vaksin");
                    input = scan.nextLine();
                    while (true){
                        switch (input){
                            case "1" :
                                System.out.println();
                                System.out.println("--------------- Daftar Vaksin yang Tersedia ---------------\n");
                                petugas.cekStokVaksin();
                                System.out.println();
                                break;
                            case "2" :
                                System.out.println("--------------- Tambah Stock Vaksin ---------------\n");
                                petugas.tambahVaksin();
                                System.out.println();
                                break;
                        }
                        System.out.println();
                        System.out.println("--------------- Menu Petugas i-Posyandu ---------------\n");
                        System.out.println("1. Cek Kesediaan Vaksin");
                        System.out.println("2. Tambah Stok Vaksin");
                        System.out.println("3. Berhenti");
                        input = scan.nextLine();
                        if(input.equals("3")) break;
                    }
                    break;

                case "2":
                    System.out.println();
                    System.out.println("--------------- Ambil Nomor Antrian ---------------\n");
                    nomorAntrian++;
                    antrian.queueEnqueue(nomorAntrian);
                    System.out.println();
                    System.out.println("Anda Antrian ke " + nomorAntrian);
                    System.out.println();
                    break;

                case "3" :
                    System.out.println();
                    System.out.println("--------------- Selamat Datang di i-Posyandu ---------------\n");
                    Anak anak = new Anak();
                    anak.menuju();
                    array.add(anak);
                    antrian.queueDequeue();
                    System.out.println("--------------- Terima Kasih, Silahkan Berkunjung Kembali ! ---------------\n");
                    break;

                case "4" :
                    System.out.println("--------------- Periksa Antrian ---------------\n");
                    antrian.queueFront();
                    System.out.println();
                    System.out.print("Antrian yang Tersisa : ");
                    antrian.queueDisplay();
                    System.out.println();

                case "END":
                    break;
            }
            System.out.println();
            System.out.println(" --------------- MENU  ---------------\n");
            System.out.println("1. Petugas Posyandu");
            System.out.println("2. Ambil Nomor Antrian");
            System.out.println("3. Ibu dan Anak Menuju Meja Satu");
            System.out.println("4. Cek Antrian");
            System.out.println("Ketik END untuk Berhenti");
            role = scan.nextLine();

            if(role.equals("END")){
                break;
            }

        }

        System.out.println();
        System.out.println(" --------------- PILIH FITUR  ---------------\n");
        System.out.println("1. Cetak Data Lengkap");
        System.out.println("2. Cetak Petugas Posyandu yang Bertugas");
        System.out.println("3. Cetak Seluruh Data Anak yang Datang");
        System.out.println("4. Cari dan Cetak Identitas Anak dengan Status Pertumbuhan Tidak Normal");
        System.out.println("5. Cari dan Cetak Anak yang Belum Mendapatkan Obat Cacing");
        System.out.println("6. Cari dan Cetak Anak dengan Status Vaksinasinya");
        System.out.println("7. Cari Data Anak Berdasarkan NIK");

        String inputAkhir = scan.nextLine();
        while(true){
            switch (inputAkhir){
                case "1" :
                    System.out.println();
                    System.out.println("--------------- Data Petugas dan Pangunjung ---------------\n");
                    System.out.println("\tData Petugas\n");
                    petugas.printDataPetugas();
                    System.out.println();
                    System.out.println("--------------- Data Anak ---------------\n");
                    for(int i = 0; i < array.size(); i++){
                        System.out.println();
                        System.out.println("Antrian ke " + (i+1));
                        System.out.println("NIK Anak : " + array.get(i).getNIK());
                        System.out.println("Nama Anak : " + array.get(i).getNamaAnak());
                        System.out.println("Nama Ibu dari Anak : " + array.get(i).getNamaOrtu());
                        System.out.println("Tinggi Badan : " + array.get(i).getTinggiBadan() + " cm");
                        System.out.println("Berat Badan : " + array.get(i).getBeratBadan() + " Kg");
                        if(array.get(i).getJenisKelamin().equals("L")){
                            System.out.println("Jenis Kelamin : Laki-laki");
                        } else if (array.get(i).getJenisKelamin().equals("P")){
                            System.out.println("Jenis Kelamin : Perempuan");
                        }
                        System.out.println("Alamat Rumah : " + array.get(i).getAlamatRumah());
                        System.out.println("Nomor HP : " + array.get(i).getNomorHp());
                        System.out.println("Tempat, Tanggal Lahir : " + array.get(i).getTempatTanggalLahir());
                        System.out.println("Status Pertumbuhan Anak : " + array.get(i).getStatusPertumbuhan());
                        System.out.println("Status Pemberian Obat Cacing : " + array.get(i).getPemberianObatCacing());
                        System.out.println("Status Pemberian Vaksin : ");
                        System.out.println("- " + array.get(i).getVaksinBCG());
                        System.out.println("- " + array.get(i).getVaksinPolio());
                        System.out.println("- " + array.get(i).getVaksinHepatitisB());
                        System.out.println("- " + array.get(i).getVaksinHiB());
                        System.out.println("- " + array.get(i).getVaksinDPT());
                        System.out.println("- " + array.get(i).getVaksinRotavirus());
                        System.out.println("- " + array.get(i).getVaksinOCV());
                        System.out.println("- " + array.get(i).getVaksinCampak());
                        System.out.println();
                        System.out.println("----------------------------------------------------------");
                    }
                    break;

                case "2" :
                    System.out.println();
                    System.out.println("--------------- Data Petugas ---------------\n");
                    petugas.printDataPetugas();
                    System.out.println();
                    break;

                case "3" :
                    System.out.println();
                    System.out.println("--------------- Data Anak ---------------\n");
                    for (int i = 0; i < array.size(); i++) {
                        System.out.println();
                        System.out.println("Antrian ke " + (i + 1));
                        System.out.println("NIK Anak : " + array.get(i).getNIK());
                        System.out.println("Nama Anak : " + array.get(i).getNamaAnak());
                        System.out.println("Tempat, Tanggal Lahir : " + array.get(i).getTempatTanggalLahir());
                        if (array.get(i).getJenisKelamin().equals("L")) {
                            System.out.println("Jenis Kelamin : Laki-laki");
                        } else if (array.get(i).getJenisKelamin().equals("P")) {
                            System.out.println("Jenis Kelamin : Perempuan");
                        }
                        System.out.println("Nama Ibu dari Anak : " + array.get(i).getNamaOrtu());
                        System.out.println("Tinggi Badan : " + array.get(i).getTinggiBadan() + " cm");
                        System.out.println("Berat Badan : " + array.get(i).getBeratBadan() + " Kg");
                        System.out.println("Alamat Rumah : " + array.get(i).getAlamatRumah());
                        System.out.println("Nomor HP : " + array.get(i).getNomorHp());
                        System.out.println("Status Pertumbuhan Anak : " + array.get(i).getStatusPertumbuhan());
                        System.out.println("Status Pemberian Obat Cacing : " + array.get(i).getPemberianObatCacing());
                        System.out.println("Status Pemberian Vaksin : ");
                        System.out.println("- " + array.get(i).getVaksinBCG());
                        System.out.println("- " + array.get(i).getVaksinPolio());
                        System.out.println("- " + array.get(i).getVaksinHepatitisB());
                        System.out.println("- " + array.get(i).getVaksinHiB());
                        System.out.println("- " + array.get(i).getVaksinDPT());
                        System.out.println("- " + array.get(i).getVaksinRotavirus());
                        System.out.println("- " + array.get(i).getVaksinOCV());
                        System.out.println("- " + array.get(i).getVaksinCampak());
                        System.out.println();
                        System.out.println("----------------------------------------------------------");
                    }
                    break;

                case "4" :
                    System.out.println();
                    System.out.println("--------------- Anak dengan Status Pertumbuhan Tidak Normal ---------------\n");
                    int cekInputCase4 = 0;
                    for (int i = 0; i < array.size(); i++) {
                        if (array.get(i).getStatusPertumbuhan().equals("Tidak Normal")) {
                            System.out.println();
                            System.out.println("Nama Anak : " + array.get(i).getNamaAnak());
                            System.out.println("Nama Ibu : " + array.get(i).getNamaOrtu());
                            System.out.println("Usia Anak : " + array.get(i).getUsia() + " Bulan");
                            System.out.println("Jenis Kelamin Anak : " + array.get(i).getJenisKelamin());
                            System.out.println("Berat Badan Anak : " + array.get(i).getBeratBadan() + " Kg");
                            System.out.println("Tinggi Badan Anak : " + array.get(i).getTinggiBadan() + " cm");
                            System.out.println("Status Pertumbuhan Anak : " + array.get(i).getStatusPertumbuhan());
                            System.out.println("Alamat Rumah : " + array.get(i).getAlamatRumah());
                            System.out.println("Nomor Telepon : " + array.get(i).getNomorHp());
                            System.out.println();
                            cekInputCase4++;
                        }
                    }
                    if(cekInputCase4 == 0){
                        System.out.println();
                        System.out.println("SEMUA ANAK MEMILIKI STATUS PERTUMBUHAN NORMA\n");
                    }
                    break;

                case "5" :
                    System.out.println();
                    System.out.println("--------------- Data Anak yang Belum Mendapatkan Obat Cacing ---------------\n");
                    int cekInputCase5 = 0;

                    for (int i = 0; i < array.size(); i++) {
                        if (array.get(i).getPemberianObatCacing().equals("Obat Cacing Belum Diberikan")) {
                            System.out.println();
                            System.out.println("Nama Anak : " + array.get(i).getNamaAnak());
                            System.out.println("Nama Ibu dari Anak : " + array.get(i).getNamaOrtu());
                            System.out.println("Alamat Rumah : " + array.get(i).getAlamatRumah());
                            System.out.println("Nomor HP : " + array.get(i).getNomorHp());
                            System.out.println();
                            cekInputCase5++;
                        }
                    }
                    if (cekInputCase5 == 0){
                        System.out.println();
                        System.out.println("SEMUA ANAK TELAH DIBERIKAN OBAT CACING");
                        System.out.println();
                    }
                    break;

                case "6" :
                    System.out.println();
                    System.out.println("--------------- Status Vaksinasi Setiap Anak ---------------\n");

                    for(int i = 0; i < array.size(); i++){
                        System.out.println();
                        System.out.println("NIK Anak : " + array.get(i).getNIK());
                        System.out.println("Nama Anak : " + array.get(i).getNamaAnak());
                        System.out.println("Nama Ibu dari Anak : " + array.get(i).getNamaOrtu());
                        System.out.println("Status Pemberian Vaksin : ");
                        System.out.println("- " + array.get(i).getVaksinBCG());
                        System.out.println("- " + array.get(i).getVaksinPolio());
                        System.out.println("- " + array.get(i).getVaksinHepatitisB());
                        System.out.println("- " + array.get(i).getVaksinHiB());
                        System.out.println("- " + array.get(i).getVaksinDPT());
                        System.out.println("- " + array.get(i).getVaksinRotavirus());
                        System.out.println("- " + array.get(i).getVaksinOCV());
                        System.out.println("- " + array.get(i).getVaksinCampak());
                        System.out.println();
                    }
                    break;

                case "7" :
                    System.out.println();
                    System.out.println("--------------- Cari Data Anak Berdasarkan NIK ---------------\n");
                    System.out.println("Masukkan NIK Anak : ");
                    int cekInputCase7 = 0;
                    int inputCase7 = scan.nextInt();

                    for (int i = 0; i < array.size(); i ++) {
                        if (array.get(i).getNIK() == inputCase7) {
                            System.out.println("NIK Anak : " + array.get(i).getNIK());
                            System.out.println("Nama Anak : " + array.get(i).getNamaAnak());
                            System.out.println("Tempat, Tanggal Lahir : " + array.get(i).getTempatTanggalLahir());
                            if (array.get(i).getJenisKelamin().equals("L")) {
                                System.out.println("Jenis Kelamin : Laki-laki");
                            } else if (array.get(i).getJenisKelamin().equals("P")) {
                                System.out.println("Jenis Kelamin : Perempuan");
                            }
                            System.out.println("Nama Ibu dari Anak : " + array.get(i).getNamaOrtu());
                            System.out.println("Berat Badan : " + array.get(i).getBeratBadan() + " Kg");
                            System.out.println("Tinggi Badan : " + array.get(i).getTinggiBadan() + " cm");
                            System.out.println("Alamat Rumah : " + array.get(i).getAlamatRumah());
                            System.out.println("Nomor HP : " + array.get(i).getNomorHp());
                            System.out.println("Status Pemberian Obat Cacing : " + array.get(i).getPemberianObatCacing());
                            System.out.println("Status Pemberian Vaksin : ");
                            System.out.println("- " + array.get(i).getVaksinBCG());
                            System.out.println("- " + array.get(i).getVaksinPolio());
                            System.out.println("- " + array.get(i).getVaksinHepatitisB());
                            System.out.println("- " + array.get(i).getVaksinHiB());
                            System.out.println("- " + array.get(i).getVaksinDPT());
                            System.out.println("- " + array.get(i).getVaksinRotavirus());
                            System.out.println("- " + array.get(i).getVaksinOCV());
                            System.out.println("- " + array.get(i).getVaksinCampak());
                            System.out.println();
                            cekInputCase7++;
                        }
                    }
                    if (cekInputCase7 == 0){
                            System.out.println();
                            System.out.println("NIK TIDAK DITEMUKAN\n");
                    }
                    break;

            }
            System.out.println();
            System.out.println(" --------------- PILIH FITUR  ---------------\n");
            System.out.println("1. Cetak Data Lengkap");
            System.out.println("2. Cetak Petugas Posyandu yang Bertugas");
            System.out.println("3. Cetak Seluruh Data Anak yang Datang");
            System.out.println("4. Cari dan Cetak Identitas Anak dengan Status Pertumbuhan Tidak Normal");
            System.out.println("5. Cari dan Cetak Anak yang Belum Mendapatkan Obat Cacing");
            System.out.println("6. Cari dan Cetak Anak dengan Status Vaksinasinya");
            System.out.println("7. Cari Data Anak Berdasarkan NIK");
            System.out.println("8. Berhenti");

            inputAkhir = scan.nextLine();
            if(inputAkhir.equals("8")){
                break;
            }
        }
        System.out.println();
        System.out.println("=================================================================================");
        System.out.println("\t\t\ti-Posyandu Management System Berhenti, Terima Kasih !");
    }
}
