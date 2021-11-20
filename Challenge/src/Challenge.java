package Challenge.src;

public class Challenge {
    
    public static void main(String[] args) {
        System.out.println("=====Program pendaftaran vaksin=====");
        // Membuat variable untuk nama, umur, kewarganegaraan
        String nama;
        int umur;
        String kewarganegaraan;

        // isi dari nilai variable tersebut
        nama = "Muhammad Najwan Sulvadli";
        umur = 14;
        kewarganegaraan = "Indonesia";
        
        // mengecek apakah kewarganegaraan "Indonesia" atau tidak
        if (kewarganegaraan.equals("Indonesia")) {
            System.out.println("kewarganegaraan anda: " + kewarganegaraan);

            /* Membuat if else untuk melakukan pengecekan sebagai berikut :
                - Jika umur besar sama dari 15 tahun, maka tampilkan pesan "Silahkan menunggu di kursi antrian".
                - Jika umur besar sama dari 8 tahun, maka tampilkan pesan "Mohon kembali tahun depan".
                - Jika kemungkinan diatas tidak ada yang benar, maka tampilkan "Umur anda belum mencukupi".
            */
            if (umur >= 15) {
                System.out.println("Silahkan menunggu di kursi antrian");
            } else if (umur >= 8) {
                System.out.println("Mohon kembali tahun depan");
            } else {
                System.out.println("Umur anda belum mencukupi");
            }
        } else {
            System.out.println("Maaf Kewarganegaraan anda bukan Indonesia"); 
        }
        
        //  Terakhir, tampilkan nama dan kelas kalian.
        System.out.println("====================================");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: Android Development & Web Development");
    }
}
