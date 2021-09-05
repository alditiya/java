public class Main {
    public static void main(String[] args) throws Exception {
        //Membuat object generic class dengan tipe data string
        GenericClass<String> myStack = new GenericClass<String>();
        myStack.push("Course");
        myStack.push("Net");
        myStack.push("Indonesia");

        System.out.println(myStack.getSize());
        System.out.println(myStack.pop());
        
        //Membuat object generic dengan tipe data int
        GenericClass<Integer> myStack2 = new GenericClass<Integer>();
        
        myStack2.push(10);
        myStack2.push(20);
        myStack2.push(30);

        System.out.println(myStack2.getSize());
        System.out.println(myStack2.pop());

        Integer [] numberArray = {2, 4, 6, 8, 10};
        String [] wordArray = {"Course", "Net", "Indonesia"};

        //method dengan tipe data integer
        print(numberArray);
        //method dengan tipe data string
        print(wordArray);
    }

    //generic method
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
