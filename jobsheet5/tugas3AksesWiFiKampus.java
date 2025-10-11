import java.util.Scanner;

public class tugas3AksesWiFiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user;
        int sks;

        System.out.print("Masukkan jenis user (dosen/mahasiswa) : ");
        user = input.nextLine();

        if (user.equalsIgnoreCase("dosen")){
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (user.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukkan jumlah SKS: ");
            sks = input.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses WiFi ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        input.close();
    } 
}
