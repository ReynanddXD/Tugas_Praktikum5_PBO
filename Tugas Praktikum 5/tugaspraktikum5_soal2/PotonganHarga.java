package tugaspraktikum5_soal2;

public class PotonganHarga {
    double harga;
    double PotonganHarga;
    double HargaAkhir;
    
    public PotonganHarga(double harga){
        this.harga = harga;
        
        if(harga < 50000){
            PotonganHarga = 0.05 * this.harga;
            HargaAkhir = this.harga - PotonganHarga;
        }else{
            PotonganHarga = 0.2 * this.harga;
            HargaAkhir = this.harga - PotonganHarga;
        }
    }
    
    public void Display(){
        System.out.println("Besarnya potongan Rp. " + PotonganHarga);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + HargaAkhir);
    }
}
