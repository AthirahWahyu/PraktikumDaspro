Percobaan 1 : Penerapan IF dan IF-ELSE untuk Mencetak KRS 
Pertanyaan 1 : Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
Jawaban : Pengecekan pada struktur IF tersebut tidak melibatkan operator relasional karena Variabel yang dicek (uktLunas) sudah bertipe boolean, sehingga langsung bisa digunakan sebagai kondisi tanpa perlu dibandingkan lagi.

Percobaan 1 : Penerapan IF dan IF-ELSE untuk Mencetak KRS
Pertanyaan 2 : Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
Jawaban : Jika nilai yang dimasukkan adalah false, maka tidak ada output tambahan dari blok if — program langsung selesai setelah input, karena uktLunas bernilai false.

Percobaan 2 : SWITCH-CASE untuk Mencetak KRS
Pertanyaan 1 : Apa fungsi dari sintaks break?
Jawaban : break berfungsi untuk menghentikan eksekusi switch-case setelah satu kondisi terpenuhi, agar program tidak menjalankan case-case berikutnya secara berurutan.

Percobaan 2 : SWITCH-CASE untuk Mencetak KRS
Pertanyaan 2 : Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
Jawaban : default berfungsi untuk menangani semua nilai yang tidak sesuai dengan case yang ada, sehingga program tetap bisa memberikan respon yang logis dan tidak berhenti begitu saja.

Percobaan 3 : Nested IF untuk Mengecek Syarat Ujian Skripsi
Pertanyaan 1 : Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?Mengapa demikian?
Jawaban : Jadi, jika mahasiswa menjawab "No" (atau “Tidak”), maka kondisi bebasKompen.equalsIgnoreCase("Ya") bernilai false.
Karena itu, program langsung masuk ke bagian else, sehingga pesan yang ditampilkan adalah : Gagal! Mahasiswa masih memiliki tanggungan kompen

Percobaan 3 : Nested IF untuk Mengecek Syarat Ujian Skripsi
Pertanyaan 2 : Jelaskan maksud dari potongan kode berikut!
                if (bimbinganP1 >= 8 && bimbinganP2 >= 4) 
Jawaban : Kode if (bimbinganP1 >= 8 && bimbinganP2 >= 4) digunakan untuk memastikan mahasiswa sudah memenuhi syarat minimal log bimbingan pada kedua pembimbing sebelum dinyatakan lulus atau berhasil mendaftar ujian skripsi.

Log bimbingan = jumlah pertemuan atau catatan kegiatan bimbingan antara mahasiswa dan dosen pembimbing yang digunakan sebagai bukti dan syarat kelulusan bimbingan skripsi.

Percobaan 3 : Nested IF untuk Mengecek Syarat Ujian Skripsi
Pertanyaan 3 : Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
Jawaban : 
1.	Program mulai dan minta input “Apakah mahasiswa sudah bebas kompen? (Ya/Tidak)”.
2.	Jika menjawab “Tidak” output Gagal! Mahasiswa masih memiliki tanggungan kompen
3.	Jika menjawab “Ya”  lanjut mengisi jumlah log bimbingan.
4.	Program memeriksa:
   - Apakah log bimbingan P1 ≥ 8
   - Dan log bimbingan P2 ≥ 4
5.	Jika dua-duanya memenuhi “Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi”
6.	Jika dua-duanya kurang pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali"
7.	Jika P1 saja kurang  pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali"
8.	Jika P2 saja kurang pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali"









