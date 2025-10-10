import java.util.Scanner;

public class switchCetakKRS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //kode berikut ini untuk menerima masukan dari keyboard yang kemudian
        //disimpan pada variabel semester bertipe int
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini : ");
        int semester = sc.nextInt();

        //struktur pemilihan SWITCH-CASE untuk mengecek semester saat ini
        switch (semester) {
            case 1:
                System.out.println("KRS Semester 1 ditampilkan");
                break;
            case 2: 
                System.out.println("KRS Semester 2 ditampilkan");
                break;
            case 3: 
                System.out.println("KRS Semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 ditampilkan");
                break;
            case 6: 
                System.out.println("KRS Semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 ditampilkan");
                break;
            default:
                System.out.println("Semester tidak valid");
        sc.close();
        }
    }
}
