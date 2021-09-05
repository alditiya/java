import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Manusia andi = new Manusia("Andi", 12);

        Mahasiswa budi = new Mahasiswa("Budi", 20, "22012345", (float) 3.49);

        //memanggil method dari parent class manusia
        andi.ulangTahun();
        budi.ulangTahun();

        //memanggil method class mahasiswa
        System.out.println("Umur Budi: " + budi.getUmur());

        //Membuat object mahasiswa dan tampung di class Manusia
        Manusia chandra = new Mahasiswa("Chandra", 21, "2328423", (float) 3.45);

        chandra.ulangTahun();
        //chandra.belajar();
        //parent tidak bisa mengakses class child
        //child dapat mengakses semua class milik parent
        System.out.println("Umur Chandra: " + chandra.getUmur());

        //tidak dapat membuat object parent class dan ditampung di child class
        //Mahasiswa Clarissa = new Manusia("Clarissa", 19);

        //array list dari class
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        listMahasiswa.add(budi);
        listMahasiswa.add(new Mahasiswa("Clarissa", 19, "22343234", (float) 3.80));

        System.out.println(listMahasiswa.get(1).getNama());

    }
    
}
