package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int input= 555;
	int output =0;
	for (int i= input;i>0;i/=10) {
		
		int rem= i%10;
		 output= output*10+rem;
		
	}
	
	if(input==output) {
		System.out.println("The number is a palindrome");
		
	}
	else {
		System.out.println(" The number is not a palindrome");
	}
}
}
