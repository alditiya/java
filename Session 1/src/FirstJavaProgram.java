
import java.util.Scanner;

public class FirstJavaProgram {

	public static void main(String[] args) {
		// OUTPUT
//		System.out.println("Hello Java");
//		System.out.print("Hello Java2");
//		System.out.printf("%sn", "Hello Java3");
		
		//primitive Data type
//		int number_integer = 5;
//		long number_long = 7;
//		float number_float = (float) 4.5;
//		double number_double = 10;
//		char alphabet = 'A';
//		boolean bool = true;
//		
//		System.out.println("integer number: " + number_integer);
//		System.out.println("Long number: " + number_long);
//		System.out.println("float number: " + number_float);
//		System.out.println("double number: " + number_double);
//		System.out.println("huruf: " + alphabet);
//		System.out.println("Boolean: " + bool);
		
		//input
//		Scanner scan = new Scanner(System.in);
//		
//		String name;
//		int age;
//		float gpa;
//		
//		System.out.println("Input Nama: ");
//		name = scan.nextLine();
//
//		System.out.println("Input Umur: ");
//		age = scan.nextInt();
//
//		System.out.println("Input GPA: ");
//		gpa = scan.nextFloat();
//		
//  		System.out.println("Nama: " + name);
//  		System.out.println("Umur: " + age);
//  		System.out.println("GPA: " + gpa);
		
		//Aritmatika
//		int number1 = 183;
//		int number2 = 49;
//		
//		System.out.println("Nomor Pertama: " + number1);
//		System.out.println("Nomor Kedua: " + number2);
//		System.out.println("Hasil Penjumlahan: " + (number1 + number2));
//		System.out.println("Hasil Pengurangan: " + (number1 - number2));
//		System.out.println("Hasil Perkalian: " + (number1 * number2));
//		System.out.println("Hasil Pembagian: " + (number1 / number2));
//		System.out.println("Hasil Modulus: " + (number1 % number2));
//		
		//selection
//		int number1 = 9;
//		int number2 = 7;
//		
//		if (number1 == number2) {
//			System.out.println("Angka sama");
//		}
//		else if(number1 > number2) {
//			System.out.println("Angka 1 > Angka 2");
//		}
//		else if(number1 < number2) {
//			System.out.println("Angka 1 < Angka 2");
//		}
//		
//		int menu = 5;
//		switch(menu) {
//			case 1:
//				System.out.println("Menu 1");
//			break;
//			
//			case 2:
//				System.out.println("Menu 2");
//			break;
//			case 3:
//				System.out.println("Menu 3");
//			break;
//			default:
//				System.out.println("Default Menu");
//			break;
//		}
		
		//repeatition / interation / looping
		
		//for
//		for(int i = 0; i < 15; i++) {
//			System.out.println("Number: " + i);
//		}
//		for(int i = 0; i < 15; i++) {
//			if(i == 5) {
//				break;
//			}
//			if(i == 3) {
//				continue;
//			}
//			System.out.println("Number: " + i);
//		}
		
//		//do while
//		int number1;
//		
//		do {
//			System.out.println("Input number [1..10]: ");
//			number1 = scan.nextInt(); scan.nextLine();
//		}while(number1 < 1 || number1 > 10);
		
		//while
		int number1 = 10;
		while(number1 > 5) {
			System.out.println("number1: " + number1);
			number1 --;
		}
	}

}
