// ATHIRAH WAHYU PUTRI SASONGKO - 1F 

// Import dan deklarasi class
// Digunakan agar kita bisa menggunakan kelas Scanner untuk membaca input dari keyboard
import java.util.Scanner;

public class CaseMethod1 {

    // Method Main untuk eksekusi awal program 
    public static void main(String[] args) {
        // Membuat objek Scanner bernama input untuk membaca data dari keyboard
        Scanner input = new Scanner(System.in); 
        // Input Data Mahasiswa
        System.out.println("============== INPUT DATA MAHASISWA ==============");
        System.out.print("Nama    : ");
        String nama = input.nextLine();
        System.out.print("NIM     : ");
        String nim = input.nextLine();

        // Input nilai untuk mata kuliah Algoritma dan Pemrograman 
        // Input data mata kuliah 1
        System.out.println("\n--- Mata Kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble(); 
        System.out.print("Nilai Kuis  : ");
        double kuis1 = input.nextDouble();
        System.out.print("Nilai Case Method : ");
        double casemethod1 = input.nextDouble();

        // Input nilai untuk mata kuliah Struktur Data
        // Input data mata kuliah 2
        System.out.println("\n--- Mata Kuliah 2 : Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();
        System.out.print("Nilai Kuis  : ");
        double kuis2 = input.nextDouble();
        System.out.print("Nilai Case Method : ");
        double casemethod2 = input.nextDouble();

        // Input nama mata kuliah dari user
        input.nextLine();
        System.out.print("\nNama Mata Kuliah   : ");
        String namaMataKuliah = input.nextLine();
        System.out.print("Nilai UTS   : ");
        double uts3 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas3 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas3 = input.nextDouble();
        System.out.print("Nilai Kuis  : ");
        double kuis3 = input.nextDouble();
        System.out.print("Nilai Case Method : ");
        double casemethod3 = input.nextDouble();


        // Validasi nilai 1-100 dengan nested if
        if (uts1 >= 1 && uts1 <= 100 && uas1 <= 100 && tugas1 >=1 && tugas1 <= 100 && kuis1 >= 1 && kuis1 <= 100 && casemethod1 >= 1 && casemethod1 <= 100 &&
            uts2 >= 1 && uts2 <= 100 && uas2 <= 100 && tugas2 >=1 && tugas2 <= 100 && kuis2 >= 1 && kuis2 <= 100 && casemethod2 >= 1 && casemethod2 <= 100 && 
            uts3 >= 1 && uts3 <= 100 && uas3 <= 100 && tugas3 >=1 && tugas3 <= 100 && kuis3 >= 1 && kuis3 <= 100 && casemethod3 >= 1 && casemethod3 <= 100) {
            
                
        // Proses menghitung nilai akhir 
        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        double nilaiAkhir3 = (uts3 * 0.3) + (uas3 * 0.4) + (tugas3 * 0.3);
                
        // Proses menentukan nilai huruf mata kuliah 1
        String huruf1;
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            huruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            huruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            huruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            huruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            huruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }

        // Proses menentukan nilai huruf mata kuliah 2
        String huruf2;
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            huruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            huruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            huruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            huruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            huruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        }

        // Proses menentukan nilai huruf mata kuliah 3
        String huruf3;
        if (nilaiAkhir3 > 80 && nilaiAkhir3 <= 100) {
            huruf3 = "A";
        } else if (nilaiAkhir3 > 73 && nilaiAkhir3 <= 80) {
            huruf3 = "B+";
        } else if (nilaiAkhir3 > 65 && nilaiAkhir3 <= 73) {
            huruf3 = "B";
        } else if (nilaiAkhir3 > 60 && nilaiAkhir3 <= 65) {
            huruf3 = "C+";
        } else if (nilaiAkhir3 > 50 && nilaiAkhir3 <= 60) {
            huruf3 = "C";
        } else if (nilaiAkhir3 > 39 && nilaiAkhir3 <= 50) {
            huruf3 = "D";
        } else {
            huruf3 = "E";
        }

        // Proses menentukan status setiap mata kuliah dari hasil akhir (Operator Ternary)
        String status1 = (nilaiAkhir1 >= 60 ) ? "LULUS" : "TIDAK LULUS";
        String status2 = (nilaiAkhir2 >= 60 ) ? "LULUS" : "TIDAK LULUS";
        String status3 = (nilaiAkhir3 >= 60 ) ? "LULUS" : "TIDAK LULUS"; 
        
        // Proses menghitung rata - rata
        double rataRata = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

        // Proses menentukan status semester (Nested If)
        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS") && status3.equals("LULUS")) {
            if (rataRata >= 70 && uas1 >=60 && uas2 >=60 && uas3 >=60) {
                statusSemester = "LULUS";
            } else if (uas1 <60 || uas2 <60 || uas3 <60) {
                statusSemester = "TIDAK LULUS (Nilai UAS MINIMAL 60)";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu Mata Kuliah tidak lulus)";
        }
        
        // OUTPUT 
        System.out.println("\n============================== HASIL PENILAIAN AKADEMIK ==============================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------");
        // \t   : Tab 
        // %.0f : Angka desimal tanpa digit di belakang koma
        // %.2F : Angka desimal dengan 2 digit di belakang koma
        // %S   : String 
        // \n   : Newline 
        System.out.printf("Algoritama Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", 
                            uts1, uas1, tugas1, nilaiAkhir1, huruf1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", 
                            uts2, uas2, tugas2, nilaiAkhir2, huruf2, status2);
        System.out.printf("%-20s\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                          namaMataKuliah, uts2, uas2, tugas2, nilaiAkhir2, huruf2, status2);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir   : %.2f\n", rataRata);
        System.out.println("Status Semester         : " + statusSemester);
        
    } else {
    //     // Jika inputan nilai di luar 1-100
        System.out.println("\nNilai tidak valid (Nilai harus diantara 1-100)!");
    }
        input.close();
    }
}

