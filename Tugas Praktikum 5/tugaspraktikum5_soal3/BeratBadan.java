package tugaspraktikum5_soal3;

public class BeratBadan {
    double BeratBadan;
    double TinggiBadan;
    double IMT;
    String kriteria;
    
    public BeratBadan(double BeratBadan, double TinggiBadan){
        this.BeratBadan = BeratBadan;
        this.TinggiBadan = TinggiBadan;
        
        IMT = BeratBadan / (TinggiBadan * TinggiBadan);
        
        if(IMT < 18.5){
            kriteria = "Berat Badan Kurang";
        }else if(IMT < 25){
            kriteria = "Berat Badan Ideal";
        }else if (IMT < 30){
            kriteria = "Berat Badan Lebih";
        }else if(IMT < 40){
            kriteria = "Gemuk";
        }else {
            kriteria = "Sangat Gemuk";
        }
    }
    
    public void Display(){
        System.out.println("Berat Badan         : " + BeratBadan + " Kg.");
        System.out.println("Tinggi Badan        : " + TinggiBadan + " M");
        System.out.println("Indek Massa Tubuh   : " + IMT + " Kg/M^2");
        System.out.println("Kriteria            : " + kriteria);
    }
}
