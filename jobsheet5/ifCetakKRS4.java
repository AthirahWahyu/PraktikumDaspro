import java.util.Scanner;

public class ifCetakKRS4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //kode berikut ini untuk menerima masukan dari keyboard yang kemudian
        //disimpan pada variabel uktLunas bertipe boolean
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktLunas = sc.nextBoolean();

        //struktur pemilihan IF untuk mengecek apakah UKT sudah lunas
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }else{
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        //modifikasi menggunakan struktur IF-ELSE yang telah dibuat ke dalam bentuk Ternary Operator
        String hasil = uktLunas
        ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println("\n--- Hasil dengan Ternary Operator ---");
        System.out.println(hasil);
        sc.close();
    }
}

