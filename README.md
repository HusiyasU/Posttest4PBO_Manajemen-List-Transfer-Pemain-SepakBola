# ⚽ Post Test 2 - PBO  
## Manajemen Transfer & Pinjaman Pemain Sepak Bola  

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)  
![CRUD](https://img.shields.io/badge/CRUD-Create%20Read%20Update%20Delete-blue?style=for-the-badge)  
![OOP](https://img.shields.io/badge/OOP-Object%20Oriented%20Programming-green?style=for-the-badge)  
![MVC](https://img.shields.io/badge/MVC-Model%20View%20Controller-orange?style=for-the-badge)  

---

## 👤 Data Diri
- **Nama** : Husaini Iyastama H.  
- **NIM** : 2409116038  
- **Kelas** : A  

---

## 📖 Deskripsi Singkat
Program ini adalah implementasi **CRUD (Create, Read, Update, Delete)** menggunakan bahasa pemrograman **Java** dengan konsep **OOP**.  

Tema yang digunakan adalah **Manajemen Transfer & Pinjaman Pemain Sepak Bola**, di mana pengguna dapat:
- ➕ Menambahkan data transfer atau pinjaman pemain  
- 📋 Melihat daftar pemain  
- ✏️ Memperbarui data pemain  
- ❌ Menghapus data pemain  
- 🔎 Mencari data pemain berdasarkan nama  

### ✨ Fitur yang diterapkan
- **ArrayList** untuk menyimpan data pemain.  
- **Packages** untuk memisahkan fungsi program:  
  - `main` - entry point & menu utama.  
  - `model` - struktur data pemain, superclass & subclass.  
  - `service` - logika CRUD & fitur pencarian.  
- **Encapsulation** - semua atribut dibuat `private` dengan getter & setter.  
- **Inheritance** - `Pemain` sebagai superclass, diturunkan ke `Transfer` dan `Pinjaman`.  
- **Overriding** - method `toString()` dioverride pada subclass agar output berbeda.
- **Polymorphism**:
  - **Overriding**: method `getDetail()` dioverride di `Transfer` & `Pinjaman`.  
  - **Overloading**: method `cariTransfer(String)` dan `cariTransfer(String, String)` di `TransferService`.
- **Abstraction** menggunakan:
  - `abstract class Pemain` dengan method `getDetail()` yang dioverride di subclass.  
  - `interface Kontrak` dengan method `jenisKontrak()` yang diimplementasikan oleh `Transfer` & `Pinjaman`.     
- **Validasi input** sederhana pada menu.  

### 🏗️ Pola MVC
- **Model (`model.Pemain`, `model.Transfer`, `model.Pinjaman`)** - Struktur data pemain.  
- **Controller (`service.TransferService`)** - Menangani logika CRUD, validasi input, serta fitur pencarian.  
- **View (`main.MainApp`)** - Entry point program, menampilkan menu, menerima input, dan memanggil service.  

---

## 🛠️ Alur Program
### Saat dijalankan, program menampilkan menu utama:

<img width="556" height="197" alt="image" src="https://github.com/user-attachments/assets/fc369b34-d57c-4ffc-9719-86e0e953beb7" />


### Penjelasan Menu
1. **Tambah Pemain**  
   - Pilih jenis: Transfer permanen atau Pinjaman.  
   - Input nama, asal tim, tujuan, biaya/durasi.  

2. **Lihat Daftar Pemain**  
   - Menampilkan semua data (transfer & pinjaman).  

3. **Ubah Data Pemain**  
   - Pilih nomor data → masukkan data baru.  
   - Mendukung update transfer maupun pinjaman.  

4. **Hapus Data Pemain**  
   - Pilih nomor data yang ingin dihapus.  

5. **Cari Data Pemain**  
   - Input keyword (nama pemain).  
   - Program menampilkan data yang sesuai.  

6. **Keluar**  
   - Program berhenti dengan pesan: `Keluar dari program...`  

---

## 📂 Struktur Package
<img width="311" height="231" alt="image" src="https://github.com/user-attachments/assets/ee14c780-7c75-4514-a494-a8fd881d8f3c" />


---

## 💻 Contoh Output
### Tambah Pemain
<img width="330" height="245" alt="image" src="https://github.com/user-attachments/assets/1d6632d1-dfb9-40eb-9dc4-d045933d768b" />

### Lihat Pemain
<img width="607" height="97" alt="image" src="https://github.com/user-attachments/assets/6c0f6d4e-51dc-4699-b20d-5b55277e34a4" />

### Update Pemain
<img width="608" height="220" alt="image" src="https://github.com/user-attachments/assets/a83eb4b3-e9ec-4ed6-9b06-0a7444250388" />

### Cari Pemain
<img width="757" height="90" alt="image" src="https://github.com/user-attachments/assets/0d5975ad-2ab3-46ef-907f-2be4c5cfaaef" />

### Hapus Pemain
<img width="676" height="128" alt="image" src="https://github.com/user-attachments/assets/2f24f01c-33c3-4b0f-9fb3-2451053c6ac9" />
<img width="252" height="63" alt="image" src="https://github.com/user-attachments/assets/a3d9c0fb-7bc1-4fe8-a758-c968452dff48" />

---

## 🏁 Penutup
Dengan program ini, manajemen transfer & pinjaman pemain sepak bola dapat dilakukan dengan mudah melalui operasi CRUD berbasis **Java OOP** 🚀









