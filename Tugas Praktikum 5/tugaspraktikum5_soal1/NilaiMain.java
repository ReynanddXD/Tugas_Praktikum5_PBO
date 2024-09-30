package tugaspraktikum5_soal1;

import java.util.Scanner;

public class NilaiMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Input NPM
        System.out.print("NPM               : ");
        String NPM = input.nextLine();
        
        //Input nama mahasiswa
        System.out.print("Nama Mahasiswa    : ");
        String Nama = input.nextLine();
        
        //Input nilai kehadiran
        System.out.print("Nilai Kehadiran   : ");
        double NilaiKehadiran = input.nextDouble();
        
        //Input nilai tugas
        System.out.print("Nilai Tugas       : ");
        double NilaiTugas = input.nextDouble();
        
        //Input nilai UTS
        System.out.print("Nilai UTS         : ");
        double NilaiUTS = input.nextDouble();
        
        //Input nilai UAS
        System.out.print("Nilai UAS         : ");
        double NilaiUAS = input.nextDouble();
        
        System.out.println(" ");
        
        //Konversi nilai
        Nilai nilai = new Nilai(NPM, Nama, NilaiKehadiran, NilaiTugas, NilaiUTS, NilaiUAS);
        
        //Display info
        nilai.Display();
    }
}
