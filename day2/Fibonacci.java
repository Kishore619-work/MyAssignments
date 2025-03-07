package week1.day2;

public class Fibonacci {
	
	public static void main(String[] args) {
	
	int range=8; 
	int firstNumber=0;
	int secondNumber=1;
	int nextNum;
	
	for (int i=0;i<range;i++) {
	System.out.println(firstNumber);	
		nextNum= firstNumber+ secondNumber;
		firstNumber= secondNumber;		
		secondNumber= nextNum;
		
		
	}
}
}
