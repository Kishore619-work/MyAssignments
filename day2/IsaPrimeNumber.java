package week1.day2;

public class IsaPrimeNumber {
public static void main(String[] args) {
	int num = 13;
	if (num<=1) {
	System.out.println("Is not a prime number");
	}
	
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			System.out.println("Is not a prime number");
			return;
		}
	}
	System.out.println("Is a prime number");
}
}
