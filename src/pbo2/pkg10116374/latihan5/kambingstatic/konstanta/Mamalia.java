package pbo2.pkg10116374.latihan5.kambingstatic.konstanta;

/**
 * @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk implementasi pada dua class
 */
public class Mamalia {
    // variabel jumlahkambing dideklarasikan sebagai statik
    public static int jumlahKambing;
    
}    
 public class KambingStatic { 
   //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
   
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak" 
                          + Mamalia.jumlahKambing);
    }
}

