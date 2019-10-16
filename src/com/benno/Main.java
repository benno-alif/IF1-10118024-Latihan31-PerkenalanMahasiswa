package com.benno;

    /*
        Nama        : Benno Alif Anggara
        Kelas       : IF1
        NIM         : 10118024
        Deskripsi   : Menampilkan Data Mahasiswa menggunakan konsep OO
     */

public class Main {
    public static void main(String[] args) {
	    Mahasiswa mhs1 = new Mahasiswa();
	    Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();

        mhs1.nim = "10110269";
	    mhs1.nama = "Rizki Adam Kurniawan";
	    mhs1.perkenalkanDiri();

        mhs2.nim = "10110270";
        mhs2.nama = "Indra Tiola";
        mhs2.perkenalkanDiri();

        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tanzil Ganefi";
        mhs3.perkenalkanDiri();

        mhs4.nim = "10110272";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs4.perkenalkanDiri();
    }
}
