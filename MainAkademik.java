
public class MainAkademik {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("21046125000", "Budi Santolo",24,3.50);
        Mahasiswa mhs2 = new Mahasiswa("21046125009", "Santolo Budi",36,4.05);
        
        System.out.println("Data Sebelum Update");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
        
        System.out.println("Update Versi 1");
        mhs1.hitungIPKSemester(3.80);
        mhs1.tampilkanData();
        
        System.out.println("Update Versi 2");
        mhs2.hitungIPKSemester(4.00, 3);
        mhs2.tampilkanData();
    }
}