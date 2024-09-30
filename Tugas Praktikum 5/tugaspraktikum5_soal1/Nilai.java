package tugaspraktikum5_soal1;

public class Nilai {
    String NPM;
    String Nama;
    double NilaiKehadiran;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;
    double NilaiAkhir;
    char Grade;
    String Keterangan;
    
    public Nilai(String NPM, String Nama, double NilaiKehadiran, 
            double NilaiTugas, double NilaiUTS, double NilaiUAS){
        this.NPM = NPM;
        this.Nama = Nama;
        this.NilaiKehadiran = NilaiKehadiran;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
        
        NilaiAkhir = (0.1*this.NilaiKehadiran) + (0.2*this.NilaiTugas) +
                (0.3*this.NilaiUTS) + (0.4*this.NilaiUAS);
        
        if (NilaiAkhir <= 45) {
            Grade = 'E';
            Keterangan = "KURANG SEKALI";
        } else if (NilaiAkhir <= 55) {
            Grade = 'D';
            Keterangan = "KURANG";
        } else if (NilaiAkhir <= 65) {
            Grade = 'C';
            Keterangan = "CUKUP";
        } else if (NilaiAkhir <= 75) {
            Grade = 'B';
            Keterangan = "BAIK";
        } else {
            Grade = 'A';
            Keterangan = "ISTIMEWA";
        }
    }
    
    public void Display(){
        
        System.out.println("---------- Display Nilai Mahasiswa ----------");
        System.out.println("NPM Mahasiswa     : " + NPM);
        System.out.println("Nama Mahasiswa    : " + Nama);
        System.out.println("Nilai Akhir       : " + NilaiAkhir);
        System.out.println("Grade             : " + Grade);
        System.out.println("Keterangan        : " + Keterangan);
        System.out.println("---------------------------------------------");
    }
}
