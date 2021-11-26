import java.io.*;

public class ProgDiscount {

    public static void main(String[] args) {
        DataInputStream dataAngka = new DataInputStream(System.in);

        // Deklarasi variable dan tipe data
        double belanja = 0.0;
        double disc = 0;
        double bayar = 0.0;

        // Bagian utama program
        System.out.println("Masukkan jumlah belanja anda dengan enter");
        try {
            belanja = Double.parseDouble(dataAngka.readLine());
        } catch (IOException e) {
            System.out.println("Terjadi Error");
        }

        // proses hitung diskon
        if (belanja >= 50000) {
            disc = belanja * 0.2;
        } else {
            disc = 0;
        }
        // proses hitung total bayar
        bayar = belanja - disc;
        // cetak belanja, diskon dan total bayar
        System.out.println("Total belanja Anda :Rp " + belanja);
        System.out.println("Diskon belanja Anda :Rp " + disc);
        System.out.println("Total bayar Anda :Rp " + bayar);

    }

}