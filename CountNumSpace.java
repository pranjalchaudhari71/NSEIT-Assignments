package Day2Assign;

	import java.util.Scanner;
	public class CountNumSpace{
	public static void main(String args[]){
	//variable declaration 
	    String str;
	int space=0;
	try (//vriable declaration and initialization
	Scanner scan = new Scanner(System.in)) {
		System.out.println("Enter the String  ");
		str=scan.nextLine();
	}
	    
	for(int i=0; i<=str.length(); i++){
	char ch=str.charAt(i);
	 if(ch==' '){
	        space++;
	    }
	}
	System.out.println("Total white space : "+space);
	}
	}
