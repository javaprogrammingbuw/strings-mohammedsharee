import java.util.Scanner;

public class Expand {  
	static String input;
	static char b;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		input = scan.nextLine();
		char a = Expandstring(input);
		System.out.println(a);
	}	
	
	public static char Expandstring(String s){
	String a="0";
	for(int i=0;i<input.length();i++){
		b=input.charAt(i);
		if(Character.isDigit(b)){
			a=a+b;
        }
		else{
        	int n=Integer.parseInt(a);
        	if(n==0){
        		System.out.print(b);
        		}
        	else{
        		for(int j=0;j<n;j++){
        		System.out.print(b);
        	    }
        	}       	
        	a="0";
        }
	}
	return b;
	} 
}
