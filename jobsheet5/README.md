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




