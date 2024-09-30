package tugaspraktikum5_soal2;

import java.util.Scanner;

public class PotonganHargaMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Input harga
        System.out.print("Total Pembelian Rp. = ");
        double harga = input.nextDouble();
        
        //inisiasi program sesuai ketentuan
        PotonganHarga pt = new PotonganHarga(harga);
        
        //display harga sesuai output 
        pt.Display();
    }
}
