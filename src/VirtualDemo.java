
public class VirtualDemo {
    public static void main(String[] args) {
        
        
        //membuat object kelas gaji
        Gaji s = new Gaji("wahyu","KUBAR",3,5000.00);

        
        //POLIMORPHISME (membuat objek kelas pegawai (berbentuk kelas gaji)
        Pegawai e = new Gaji("ini nama","samarinda",2,2500.00);


        //DOWNCASTING
        System.out.println("memanggil mailchheck berdasarkan referensi gaji--");
        s.mailcheck();


        //UPCASTING
        System.out.println("\nmemanggil mailcheck berdasarkan referensi pegawai--");
        e.mailcheck();
    }
}


//========== HASIL RUN PROGRAM ============
/*
Menyusun Pegawai
Menyusun Pegawai

Memanggil mailcheck berdasarkan referensi gaji--
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailcheck berdasarkan referensi pegawai--
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Ini Nama dengan gaji 2500.0

*/


//========= ANALISIS HASIL RUN ==========
/*
Menyusun Pegawai muncul 2 kali dikarenakan perintah untuk mencetak kalimat tersebut akan dijalankan setiap kali membuat object kelas gaji atau pegawai
bagian pertama bernama wahyu dengan gaji 5000 karena di ambil dari referensi kelas gaji (DOWNCASTING)
bagian kedua bernama ini nama dengan gaji 2500 karena di ambil dari kelas pegawai (UPCASTING)

Polimorphisme terdapat pada object e (pembuatan object kelas pegawai dengan bentuk kelas gaji

*/
