public class Main {
    
    public static void main(String[] args) {
        Manusia andi = new Manusia();
        Mahasiswa budi = new Mahasiswa();

        //set attrib
        andi.setNama("Andi");
        andi.setUmur(19);

        budi.setNama("Budi");
        budi.setNim("232423123");
        budi.setUmur(19);
        budi.setIpk((float)3.0);

        //gunakan method belajar hasil overloading
        budi.belajar();
        System.out.println(budi.getNama() + " memiliki IPK " + budi.getIpk());
        budi.belajar(5);
        System.out.println(budi.getNama() + " memiliki IPK " + budi.getIpk());
        
        budi.belajar(4, "Clarissa");
        System.out.println(budi.getNama() + " memiliki IPK " + budi.getIpk());

        //overriding
        andi.rename("Garry");
        budi.rename("Larry");

    }
}
