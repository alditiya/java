public class Main {
    public static void main(String[] args) throws Exception {

        //error akan terjadi jika dibuat object dari abstract Class
        // Animal dog = new Animal;

        //buat object dari class turunan
        Cat cat = new Cat();

        //panggil method yang sudah di override dari abstract method
        cat.makeNoise();

        //membuat object Wolf dan ditampung di abstract class
        Animal obj = new Wolf();
        obj.makeNoise();

        System.out.println();

        //tidak bisa membuat object dari interface tapi bisa lewat subclass

        //membuat object dari class yang implement interface
        RealClassInterface obj2 = new RealClassInterface();
        obj2.interfaceMethod();

        //number dari object 2 tidak dapat diganti karena merupakan static final
        //obj2.number = 50;

        //number dari interface tidak dapat diganti karena merupakan static final
        //RealClassInterface.number = 50;


    }
}
