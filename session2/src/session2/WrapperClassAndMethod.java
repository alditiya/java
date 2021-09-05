package session2;

import java.util.Scanner;
public class WrapperClassAndMethod {

	public static void main(String[] args) {
		//Wrapper Class
	    
	    // Wrapper Class
//	    Integer number_integer = 5;
//	    Float number_float = (float) 10;
//	    Character alphabet = 'A';
//	    Boolean bool = true;
//
//	    //bool is object, object can be set as null
//	    bool = null;
//
//	    //method
//	    number_integer = Integer.valueOf("170");
//	    System.out.println(number_integer);
//	    
//	    //lower limit dari integer dan float
//	    System.out.println(number_integer.MIN_VALUE);
//	    System.out.println(number_float.MIN_VALUE);
//
//	    //Max limit
//	    System.out.println(number_integer.MAX_VALUE);
//	    System.out.println(number_float.MAX_VALUE);
	    
	    //String
		
	    String word1 = "Course-Net";
	    String word2 = new String ("Indonesia");
	    
	    System.out.println(word1 + " " + word2);
	    
//	    //1 way
//	    if(word1 == word2) {
//	    	System.out.println("word1 same as word2");
//	    }
//	    else {
//	    	System.out.println("word1 not same with word2");
//	    }
//	    //2 way
//	    if(word1.equals(word2) == true) {
//	    	System.out.println("word1 same as word2");
//	    }
//	    else {
//	    	System.out.println("word1 not same with word2");
//	    }
//	    //3 way
//	    if(word1.compareTo(word2) == 0) {
//	    	System.out.println("word1 same with word2");
//	    }
//	    else {
//	    	System.out.println("word1 not same with word2");
//	    }
//	    //length
//	    //return string length
//	    System.out.println(word1.length());
//	    
//	    //charAt
//	    //get particular char index
//	    System.out.println(word1.charAt(2)); //U
//	    
//	    //concat
//	    //concatenate string
//	    System.out.println(word1.concat(word2));
//	    
//	    //substring
//	    //get particular range index
//	    System.out.println(word1.substring(2, 5));
//	    
//	    //lowercase
//	    System.out.println(word1.toLowerCase());
//	    
//	    //uppercase
//	    System.out.println(word1.toUpperCase());
//	    
//	    //trim
//	    //delete right and left whitespace
//	    word1 = "       Course-Net        ";
//	    System.out.println(word1.trim()); //Course-Net
//	    
//	    //replace
//	    //replacing char to another char
//	    String name = "Haryanto";
//	    
//	    System.out.println(name.replace('a', 'o')); //Horyonto
//	    
//	    //replacefirst
//	    //replacing first found character
//	    name = "Haryanto";
//	    
//	    System.out.println(name.replaceFirst("a", "o")); //Horyanto
//	    
//	    //split
//	    //splitting string as particular format
//	    String split_string = "Course#Net#Indonesia";
//	    String[] result = split_string.split("#");
//	    
//	    for(int i = 0; i < result.length; i++) {
//	    	System.out.println(result[i]);
//	    }
//	    
//	    // Math Method
//	    //ceil
//	    //upperbound (rounded)
//	    System.out.println(Math.ceil(4.3)); //5
//	    
//	    //floor
//	    //lower bound
//	    System.out.println(Math.floor(4.7)); //4
//	    
//	    //round
//	    //according the number
//	    System.out.println(Math.round(4.4));
//	    
	    Scanner scan = new Scanner(System.in);
//	    //exception Handling
//	    int number;
//	    number = scan.nextInt();
//	    
//	    System.out.println("Finish");
	    int number;
	    
	    try {
			System.out.println("input number: ");
			number = scan.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Input must be number");
		}
	    System.out.println("Finish");
	}

}
