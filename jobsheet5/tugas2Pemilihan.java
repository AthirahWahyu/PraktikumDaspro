import java.util.Scanner;

public class tugas2Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        int angka = sc.nextInt();

        //struktur pemilihan IF-ELSE
        if (angka % 2 == 0) {
            System.out.println("Angka tersebut adalah Genap");
        } else {
            System.out.println("Angka tersebut adalah Ganjil");
        }
        sc.close();
    }
    
}
