import java.util.Scanner;

public class Palindrome{


	public static void main(String args[])  
	   {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text to be checked for Palindrome");
		String in =  scan.nextLine(); 
		
		System.out.println(isPalindrome(in));
		
		
	   }
	public static boolean isPalindrome (String input) {
		
	      String reverse = "";
	      boolean a = true;
	      input = input.toUpperCase(); // changing input to upper case
	      input= input.replace(" ", ""); // Removing spaces
	      int length = input.length(); 
	      
	      for ( int i = length-1 ; i >= 0; i-- )  
	         reverse = reverse + input.charAt(i);  
	      
	      if (input.equals(reverse))  
	         System.out.println(a);  
	      else  
	         a=false;  
		return a ;
		
	}
	 
 
	
}
