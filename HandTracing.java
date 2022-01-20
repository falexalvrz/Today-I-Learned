package exam1;

public class HandTracing {
	static int factorial (int number) {
		if (number <= 1) {
			return 1; 
		}
		int x = number * factorial(number-1);
		System.out.println(x);
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}
