
public class Mahasiswa {
    
    public String Nim;
    public String Nama;
    public int sks;
    public double ipk;
    
    public Mahasiswa (String Nim, String Nama, int sks, double ipk){
        this.Nim = Nim;
        this.Nama = Nama;
        this.sks = sks;
        this.ipk = ipk;
    }
    
//    Versi 1
    public void hitungIPKSemester(double nilaiAkhir){
        ipk = (ipk + nilaiAkhir) / 2;
    }
    
//    Versi 2
    public void hitungIPKSemester(double nilaiAkhir, int bobotSks){
        this.ipk = ((ipk * sks) + (nilaiAkhir * bobotSks)) / (sks + bobotSks);
        this.sks = this.sks + bobotSks;
    }
    
    public void tampilkanData(){
        System.out.println("Nim : " + this.Nim);
        System.out.println("Nama : " + this.Nama);
        System.out.println("sks : " + this.sks);
        System.out.println("ipk : " + this.ipk);
    }
}