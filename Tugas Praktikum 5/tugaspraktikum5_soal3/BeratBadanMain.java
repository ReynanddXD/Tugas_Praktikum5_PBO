package tugaspraktikum5_soal3;

import java.util.Scanner;

public class BeratBadanMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        //Input berat badan
        System.out.print("Berat Badan-mu    : ");
        double berat = input.nextDouble();
        
        //Input tinggi badan
        System.out.print("Tinggi Badan-mu   : ");
        double tinggi = input.nextDouble();
        
        System.out.println("-------------------------------");
        
        //inisiasi
        BeratBadan bd = new BeratBadan(berat, tinggi);
        
        //display berat, tinggi, imt dan kriteria
        bd.Display();
    } 
}
