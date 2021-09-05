import java.util.Scanner;
import java.util.Vector;

public class Main {

    Scanner scan = new Scanner(System.in);
    Vector<Barang> listBarang = new Vector<>();
    int counter = 0;

    private void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println("");
        }
    }
    public void tampilkanBarang() {
        if (listBarang.isEmpty()){
            System.out.println("\nBELUM ADA DATA BARANG");
        } else {

            for (int i = 0; i < listBarang.size(); i++) {
                System.out.println("---------------");
                System.out.println("ID: " + listBarang.get(i).getId());
                System.out.println("Nama: " + listBarang.get(i).getNama());
                System.out.println("Harga: " + listBarang.get(i).getHarga());
            
            }
            System.out.println("");
        }
    }
    private String generateID(){
        // String id = "BR" + String.format(%03d, counter);
        // counter++;

        // return id;
        return String.format("BR%03d", counter++);
    }
    public void tambahBarang() {
        String id;
        String nama;
        int harga;

        clearScreen();
        tampilkanBarang();

        System.out.printf("Nama Barang: ");
        nama = scan.nextLine();

        System.out.printf("Harga Barang: RP.");
        harga = scan.nextInt(); scan.nextLine();

        id = generateID();
        System.out.println("\n" + nama + " Berhasil ditambahkan.");

        // Barang barang = new Barang(id, nama, harga);
        // listBarang.add(barang);
        listBarang.add(new Barang (id, nama, harga));
    }
    private int searchIndexBarangByID(String id) {
        for (int i = 0; i < listBarang.size(); i++) {

            if (listBarang.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void hapusBarang() {
        String id;
        int idx;

        clearScreen();
        tampilkanBarang();

        System.out.printf("Masukkan ID Barang yang ingin dihapus: ");
        id = scan.nextLine();

        idx = searchIndexBarangByID(id);

        if (idx == 1) {
            System.out.println("Barang tidak ketemu");

        } else {
            
            System.out.println(listBarang.get(idx).getNama() + " Telah dihapus.");
            listBarang.remove(idx);
        }

    }

    public Main() {

        int pilihan;

        do {

            System.out.println("Gudang Digital");
            System.out.println("==============");
            System.out.println("1. Tampilkan List Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. exit");
    
            System.out.printf("Pilihan: ");
            pilihan = scan.nextInt(); scan.nextLine();
    
            if (pilihan == 1) tampilkanBarang();
            else if (pilihan == 2) tambahBarang();
            else if (pilihan == 3) hapusBarang();
            else if (pilihan == 4) System.out.println("TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM INI");
        
            scan.nextLine();
            clearScreen();
        } while (pilihan != 4);
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }
}