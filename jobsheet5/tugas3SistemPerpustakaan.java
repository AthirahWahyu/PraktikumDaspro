import java.util.Scanner;

public class tugas3SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean membawaKartuMahasiswa;
        boolean sudahRegistrasiOnline;

        System.out.print("Apakah membawa kartu mahasiswa? (true/false) : ");
        membawaKartuMahasiswa = input.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false) : ");
        sudahRegistrasiOnline = input.nextBoolean();

        //struktur IF dengan logika OR (||)
        if (membawaKartuMahasiswa == true || sudahRegistrasiOnline == true) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }
        input.close();
    }
    
}
