import java.util.Scanner;

public class nestedUjianSkripsi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variabel pesan bertipe String untuk menyimpan hasil keluaran kondisi
        String pesan;

        // kode berikut ini untuk menerima masukan dari keyboard terkait informasi
        //kompen yang kemudian disimpan pada variabel bebasKompen bertipe String
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) : ");
        String bebasKompen = sc.nextLine().trim();

        //kode berikut ini untuk menerima masukan dari keyboard terkait informasi
        //log bimbingan yang kemudian disimpan pada variabel bimbinganP1 dan bimbinganP2
        //bertipe int
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        //struktur pemilihan Nested-IF untuk mengecek kondisi kompen pada level
        //pertama dan jumlah log bimbingan pada level kedua
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";                
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            } 
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}
