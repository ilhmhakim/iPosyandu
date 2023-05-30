package posyandu.logic;

public class KMS {
    String statusKMS;

    public String cekKMS(String jenisKelamin, int usiaAnak, int tinggiBadan, int beratBadan){
        if(jenisKelamin.equals("L")){
            if((usiaAnak == 0) && (tinggiBadan >= 46.1 && tinggiBadan <= 55.6) && ( beratBadan >= 2.5 && beratBadan <= 3.9)) statusKMS = "Normal";
            else if((usiaAnak == 1) && (tinggiBadan >= 50.8 && tinggiBadan <= 60.6) && ( beratBadan >= 3.4 && beratBadan <= 5.1)) statusKMS = "Normal";
            else if((usiaAnak == 2) && (tinggiBadan >= 54.4 && tinggiBadan <= 64.4) && ( beratBadan >= 4.3 && beratBadan <= 6.3)) statusKMS = "Normal";
            else if((usiaAnak == 3) && (tinggiBadan >= 57.3 && tinggiBadan <= 67.6) && ( beratBadan >= 5 && beratBadan <= 7.2)) statusKMS = "Normal";
            else if((usiaAnak == 4) && (tinggiBadan >= 59.7 && tinggiBadan <= 70.1) && ( beratBadan >= 5.6 && beratBadan <= 7.8)) statusKMS = "Normal";
            else if((usiaAnak == 5) && (tinggiBadan >= 61.7 && tinggiBadan <= 72.2) && ( beratBadan >= 6 && beratBadan <= 8.4)) statusKMS = "Normal";
            else if((usiaAnak == 6) && (tinggiBadan >= 63.3 && tinggiBadan <= 74) && ( beratBadan >= 6.4 && beratBadan <= 8.8)) statusKMS = "Normal";
            else if((usiaAnak == 7) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 8) && (tinggiBadan >= 66.2 && tinggiBadan <= 77.3) && ( beratBadan >= 6.9 && beratBadan <= 9.6)) statusKMS = "Normal";
            else if((usiaAnak == 9) && (tinggiBadan >= 67.5 && tinggiBadan <= 78.7) && ( beratBadan >= 7.1 && beratBadan <= 9.9)) statusKMS = "Normal";
            else if((usiaAnak == 10) && (tinggiBadan >= 68.7 && tinggiBadan <= 80.1) && ( beratBadan >= 7.4 && beratBadan <= 10.2)) statusKMS = "Normal";
            else if((usiaAnak == 11) && (tinggiBadan >= 69.9 && tinggiBadan <= 81.5) && ( beratBadan >= 7.6 && beratBadan <= 10.5)) statusKMS = "Normal";
            else if((usiaAnak == 12) && (tinggiBadan >= 71 && tinggiBadan <= 82.9) && ( beratBadan >= 7.7 && beratBadan <= 10.8)) statusKMS = "Normal";
            else statusKMS = "Tidak Normal";
        } else if (jenisKelamin.equals("P")) {
            if((usiaAnak == 0) && (tinggiBadan >= 45.4 && tinggiBadan <= 54.7) && ( beratBadan >= 2.4 && beratBadan <= 3.7)) statusKMS = "Normal";
            else if((usiaAnak == 1) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 2) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 3) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 4) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 5) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 6) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 7) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 8) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 9) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 10) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 11) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else if((usiaAnak == 12) && (tinggiBadan >= 64.8 && tinggiBadan <= 75.7) && ( beratBadan >= 6.7 && beratBadan <= 9.2)) statusKMS = "Normal";
            else statusKMS = "Tidak Normal";
        } else {
            statusKMS = "Tidak Normal";
        }

            return statusKMS;
    }
}
