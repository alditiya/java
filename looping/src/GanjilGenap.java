public class GanjilGenap {
    public static void main(String [] args){
        //Ganjil
        System.out.print("Bilangan Ganjil dari 1 - 30 : " + '\n');
        for(int x=1; x <=30;x++){
        if(x % 2 == 1 )
        System.out.print(" "+x);
        }
        //Genap
        System.out.print('\n'+"Bilangan Genap dari 1 - 30 : " + '\n');
        for(int x=1; x <=30;x++){
        if(x % 2 == 0 )
        System.out.print(" "+x);
        }
    }
}
