# AIR-READING - Aplikasi PDF Reader
**Proyek UTS Pemrograman Bergerak**

## Anggota Kelompok
1. [220401010092] - [ ARWAN ]
2. [220401070413] - [SABRINA ZULFA WAHIDAH]

## Deskripsi Aplikasi
AIR-READING adalah aplikasi pembaca PDF untuk platform Android yang memungkinkan pengguna untuk:
- Membaca file PDF
- Mengelola koleksi buku digital
- Melihat Dokumen PDF
- Manajemen Dokumen
- Antarmuka Modern dengan Gradasi Warna Biru

## Teknologi yang Digunakan
- Java
- Android SDK
- Android PDF Viewer library
- AndroidX
- Material Design Components

## Requirement
- Android Studio / IntelliJ IDEA
- JDK 17
- Android SDK
- Minimum Android API 21 (Android 5.0)

## Konseptualisasi (Konsep)
Tahap awal adalah menentukan kebutuhan dan merancang fitur aplikasi.

1. Definisi Tujuan
2. Membuat aplikasi pembaca PDF dengan fitur utama
3. Membaca file PDF
4. Mengelola koleksi buku digital
5. Antarmuka modern

##  Identifikasi Kebutuhan Teknis
- Teknologi yang digunakan: Java, Android SDK, Android PDF Viewer Library.
- Requirement: JDK 17, Android SDK, API minimum 21.
- Wireframe dan UI/UX Design:
a. Rancang layout aplikasi menggunakan tools seperti Figma atau Sketch.
b. Menentukan antarmuka dengan gradasi warna biru menggunakan Material Design.

## Pengembangan (Coding)
Tahap ini adalah proses pengembangan aplikasi berdasarkan desain dan konsep.

a. Persiapan Proyek
1. Setup Lingkungan Kerja
2. Unduh dan pasang Android Studio serta JDK 17.
3. Pastikan Android SDK API 21 ke atas tersedia.
4. Buat Proyek Baru
5. Pilih template kosong (Empty Activity) di Android Studio.
6. Konfigurasikan proyek sesuai requirement.
7. Tambahkan Dependensi
8. Update file build.gradle:

b. Pengembangan Fitur Utama
1. Fitur Membaca PDF
2. Gunakan Android PDF Viewer Library untuk membuka file PDF.
3. Fitur Manajemen Koleksi Buku
4. Buat RecyclerView untuk menampilkan daftar file PDF.
5. Gunakan Material Design Components untuk tombol, toolbar, dan elemen lainnya.
Terapkan tema dengan gradasi biru di file res/values/colors.xml.

## Debugging
Identifikasi dan perbaiki bug untuk memastikan aplikasi berjalan dengan baik.
- Log Debugging: Menggunakan Logcat di Android Studio untuk memonitor error.
- Error Handling: Menambahkan pengecekan error untuk file yang tidak valid.
- Validasi UI: Memeriksa tampilan di emulator dan perangkat dengan ukuran layar berbeda.

## Pengujian (Testing)
Melakukan pengujian untuk memastikan semua fitur berjalan dengan baik.
- Unit Testing & UI Testing : untuk menguji logika aplikasi dan menguji interaksi pengguna dengan antarmuka.
- Pengujian Manual : Jalankan aplikasi di beberapa perangkat Android (API 21 ke atas) untuk memastikan kompatibilitas.
- Perbaikan Bug : Dokumentasikan dan perbaiki masalah yang ditemukan selama pengujian.

## Cara Menjalankan Aplikasi
1. Clone repository ini
2. Buka project menggunakan Android Studio
3. Sync gradle dan build project
4. Run aplikasi di emulator atau device Android

## Lisensi
Copyright © 2024 AIR-READING Team