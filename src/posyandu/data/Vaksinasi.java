package posyandu.data;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Vaksinasi {
    Scanner scan = new Scanner(System.in);
    int vaksinBCG, vaksinPolio, vaksinHepatitisB, vaksinHiB, vaksinDPT,
            vaksinRotavirus, vaksinOCV, vaksinCampak;


    public Vaksinasi(){
        this.vaksinBCG = 0;
        this.vaksinPolio = 0;
        this.vaksinHepatitisB = 0;
        this.vaksinHiB = 0;
        this.vaksinDPT = 0;
        this.vaksinRotavirus = 0;
        this.vaksinOCV = 0;
        this.vaksinCampak = 0;
    }

    public int getVaksinBCG() {
        return vaksinBCG;
    }

    public void setVaksinBCG(int vaksinBCG) {
        this.vaksinBCG += vaksinBCG;
    }

    public int getVaksinPolio() {
        return vaksinPolio;
    }

    public void setVaksinPolio(int vaksinPolio) {
        this.vaksinPolio += vaksinPolio;
    }

    public int getVaksinHepatitisB() {
        return vaksinHepatitisB;
    }

    public void setVaksinHepatitisB(int vaksinHepatitisB) {
        this.vaksinHepatitisB += vaksinHepatitisB;
    }

    public int getVaksinHiB() {
        return vaksinHiB;
    }

    public void setVaksinHiB(int vaksinHiB) {
        this.vaksinHiB += vaksinHiB;
    }

    public int getVaksinDPT() {
        return vaksinDPT;
    }

    public void setVaksinDPT(int vaksinDPT) {
        this.vaksinDPT += vaksinDPT;
    }

    public int getVaksinRotavirus() {
        return vaksinRotavirus;
    }

    public void setVaksinRotavirus(int vaksinRotavirus) {
        this.vaksinRotavirus += vaksinRotavirus;
    }

    public int getVaksinOCV() {
        return vaksinOCV;
    }

    public void setVaksinOCV(int vaksinOCV) {
        this.vaksinOCV += vaksinOCV;
    }

    public int getVaksinCampak() {
        return vaksinCampak;
    }

    public void setVaksinCampak(int vaksinCampak) {
        this.vaksinCampak += vaksinCampak;
    }

    public void add(){
        System.out.println("Tambah Persediaan Vaksin");
        System.out.println("Tambahkan Vaksin BCG Sebanyak : ");
        setVaksinBCG(scan.nextInt());
        System.out.println("Tambahkan Vaksin Polio Sebanyak : ");
        setVaksinPolio(scan.nextInt());
        System.out.println("Tambahkan Vaksin Hepatitis B Sebanyak : ");
        setVaksinHepatitisB(scan.nextInt());
        System.out.println("Tambahkan Vaksin HiB Sebanyak : ");
        setVaksinHiB(scan.nextInt());
        System.out.println("Tambahkan Vaksin DPT Sebanyak : ");
        setVaksinDPT(scan.nextInt());
        System.out.println("Tambahkan Vaksin Rotavirus Sebanyak : ");
        setVaksinRotavirus(scan.nextInt());
        System.out.println("Tambahkan Vaksin OCV Sebanyak : ");
        setVaksinOCV(scan.nextInt());
        System.out.println("Tambahkan Vaksin Campak Sebanyak : ");
        setVaksinCampak(scan.nextInt());
    }
    public void available(){
        System.out.println("Cek Stok Vaksin : ");
        if(this.vaksinBCG > 0){
            System.out.println("Vaksin BCG Tersedia " + getVaksinBCG());
        } else{
            System.out.println("Stok Vaksin BCG Kosong");
        }

        if(this.vaksinPolio > 0){
            System.out.println("Vaksin Polio Tersedia " + getVaksinPolio());
        } else{
            System.out.println("Stok Vaksin Polio Kosong");
        }

        if(this.vaksinHepatitisB > 0){
            System.out.println("Vaksin Hepatitis B Tersedia " + getVaksinHepatitisB());
        } else{
            System.out.println("Stok Vaksin Hepatitis Kosong");
        }

        if(this.vaksinHiB > 0){
            System.out.println("Vaksin HiB Tersedia " + getVaksinHiB());
        } else{
            System.out.println("Stok Vaksin HiB Kosong");
        }

        if(this.vaksinDPT > 0){
            System.out.println("Vaksin DPT Tersedia " + getVaksinDPT());
        } else{
            System.out.println("Stok Vaksin BPT Kosong");
        }

        if(this.vaksinRotavirus > 0){
            System.out.println("Vaksin Rotavirus Tersedia " + getVaksinRotavirus());
        } else{
            System.out.println("Stok Vaksin Rotavirus Kosong");
        }

        if(this.vaksinOCV > 0){
            System.out.println("Vaksin OCV Tersedia " + getVaksinOCV());
        } else{
            System.out.println("Stok Vaksin OCV Kosong");
        }

        if(this.vaksinCampak > 0){
            System.out.println("Vaksin Campak Tersedia " + getVaksinCampak());
        } else{
            System.out.println("Stok Vaksin Campak Kosong");
        }
    }

}

class StatusVaksin{
    Scanner scan = new Scanner(System.in);
    Vaksinasi vaksinasi = new Vaksinasi();
    String statusVaksinBCG, statusVaksinPolio, statusVaksinHepatitisB, statusVaksinHiB, statusVaksinDPT,
            statusVaksinRotavirus, statusVaksinOCV, statusVaksinCampak;

    public StatusVaksin() {
        this.statusVaksinBCG = "Vaksin BCG Belum Diberikan";
        this.statusVaksinPolio = "Vaksin Polio Belum Diberikan";
        this.statusVaksinHepatitisB = "Vaksin Hepatitis B Belum Diberikan";
        this.statusVaksinHiB = "Vaksin HiB Belum Diberikan";
        this.statusVaksinDPT = "Vaksin DPT Belum Diberikan";
        this.statusVaksinRotavirus = "Vaksin Rotavirus Belum Diberikan";
        this.statusVaksinOCV = "Vaksin OCV Belum Diberikan";
        this.statusVaksinCampak = "Vaksin Campak Belum Diberikan";
    }

    public String getStatusVaksinBCG() {
        return statusVaksinBCG;
    }

    public void setStatusVaksinBCG(String statusVaksinBCG) {
        this.statusVaksinBCG = statusVaksinBCG;
    }

    public String getStatusVaksinPolio() {
        return statusVaksinPolio;
    }

    public void setStatusVaksinPolio(String statusVaksinPolio) {
        this.statusVaksinPolio = statusVaksinPolio;
    }

    public String getStatusVaksinHepatitisB() {
        return statusVaksinHepatitisB;
    }

    public void setStatusVaksinHepatitisB(String statusVaksinHepatitisB) {
        this.statusVaksinHepatitisB = statusVaksinHepatitisB;
    }

    public String getStatusVaksinHiB() {
        return statusVaksinHiB;
    }

    public void setStatusVaksinHiB(String statusVaksinHiB) {
        this.statusVaksinHiB = statusVaksinHiB;
    }

    public String getStatusVaksinDPT() {
        return statusVaksinDPT;
    }

    public void setStatusVaksinDPT(String statusVaksinDPT) {
        this.statusVaksinDPT = statusVaksinDPT;
    }

    public String getStatusVaksinRotavirus() {
        return statusVaksinRotavirus;
    }

    public void setStatusVaksinRotavirus(String statusVaksinRotavirus) {
        this.statusVaksinRotavirus = statusVaksinRotavirus;
    }

    public String getStatusVaksinOCV() {
        return statusVaksinOCV;
    }

    public void setStatusVaksinOCV(String statusVaksinOCV) {
        this.statusVaksinOCV = statusVaksinOCV;
    }

    public String getStatusVaksinCampak() {
        return statusVaksinCampak;
    }

    public void setStatusVaksinCampak(String statusVaksinCampak) {
        this.statusVaksinCampak = statusVaksinCampak;
    }

    public void takeVac(){
        System.out.println();
        System.out.println("------- Pemberian Vaksin -------\n");
        System.out.println("Pilih Vaksin yang Akan Diambil");
        System.out.println("1. Vaksin BCG");
        System.out.println("2. Vaksin Polio");
        System.out.println("3. Vaksin HiB");
        System.out.println("4. Vaksin DPT");
        System.out.println("5. Vaksin Rotavirus");
        System.out.println("6. Vaksin OCV");
        System.out.println("7. Vaksin Campak");
        System.out.println("8. Vaksin Hepatitis B");

        String inputVak = scan.nextLine();

        while (true){
            switch (inputVak){
                case "1" :
                    setStatusVaksinBCG("Vaksin BCG Telah Diberikan");
                    vaksinasi.setVaksinBCG(vaksinasi.getVaksinBCG()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "2" :
                    setStatusVaksinPolio("Vaksin Polio Telah Diberikan");
                    vaksinasi.setVaksinPolio(vaksinasi.getVaksinPolio()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "3" :
                    setStatusVaksinHiB("Vaksin HiB Telah Diberikan");
                    vaksinasi.setVaksinHiB(vaksinasi.getVaksinHiB()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "4" :
                    setStatusVaksinDPT("Vaksin DPT Telah Diberikan");
                    vaksinasi.setVaksinDPT(vaksinasi.getVaksinDPT()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "5" :
                    setStatusVaksinRotavirus("Vaksin Rotavirus Telah Diberikan");
                    vaksinasi.setVaksinRotavirus(vaksinasi.getVaksinRotavirus()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "6" :
                    setStatusVaksinOCV("Vaksin OCV Telah Diberikan");
                    vaksinasi.setVaksinOCV(vaksinasi.getVaksinOCV()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "7" :
                    setStatusVaksinCampak("Vaksin Campak Telah Diberikan");
                    vaksinasi.setVaksinCampak(vaksinasi.getVaksinCampak()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
                case "8" :
                    setStatusVaksinHepatitisB("Vaksin Hepatitis B Telah Diberikan");
                    vaksinasi.setVaksinHepatitisB(vaksinasi.getVaksinHepatitisB()-1);
                    System.out.println("Vaksin Telah Diberikan");
                    break;
            }
            System.out.println("Pilih Vaksin yang Akan Diambil");
            System.out.println("1. Vaksin BCG");
            System.out.println("2. Vaksin Polio");
            System.out.println("3. Vaksin HiB");
            System.out.println("4. Vaksin DPT");
            System.out.println("5. Vaksin Rotavirus");
            System.out.println("6. Vaksin OCV");
            System.out.println("7. Vaksin Campak");
            System.out.println("8. Vaksin Hepatitis B");
            System.out.println("9. Berhenti ");
            inputVak = scan.nextLine();
            if(inputVak.equals("9")){
                break;
            }
        }
    }
    public void status(){
        System.out.println(getStatusVaksinBCG());
        System.out.println(getStatusVaksinPolio());
        System.out.println(getStatusVaksinHiB());
        System.out.println(getStatusVaksinDPT());
        System.out.println(getStatusVaksinRotavirus());
        System.out.println(getStatusVaksinOCV());
        System.out.println(getStatusVaksinCampak());
        System.out.println(getStatusVaksinHepatitisB());
    }


}



