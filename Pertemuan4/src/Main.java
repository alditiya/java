public class Main {
    public static void main(String[] args) {
        //Membuat object menggunakan Cons tanpa Parameter
        Mahasiswa andi = new Mahasiswa();
        
        //Membuat Object dengan Cons dengan Parameter
        Mahasiswa budi = new Mahasiswa("1234", "budi", (float) 3.89);
        System.out.println("NIM: " + andi.getNim());
        System.out.println("Nama: " + andi.getNama());
        System.out.println("IPK: " + andi.getIpk());

        System.out.println("NIM: " + budi.getNim());
        System.out.println("Nama: " + budi.getNama());
        System.out.println("IPK: " + budi.getIpk());

        //memanggil method belajar
        andi.belajar((float) 150);
        System.out.println("IPK: " + andi.getIpk());

        //memanggil static variable
        //dapat dipanggil melalui object maupun class
        Mahasiswa.jumlah = 10;

        System.out.println(Mahasiswa.jumlah);
        System.out.println(andi.jumlah);
        System.out.println(budi.jumlah);

        andi.jumlah = 20;

        System.out.println(Mahasiswa.jumlah);
        System.out.println(andi.jumlah);
        System.out.println(budi.jumlah);

        //Memanggil static tambahMahasiswa
        Mahasiswa.tambahMahasiswa();
        System.out.println(Mahasiswa.jumlah);
    }
}
