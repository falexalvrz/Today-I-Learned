package exam1;

public class Debugging {
	public static int generate(int x) {
		System.out.print(x%10);
		if ((x/10)!= 0) {
			generate(x/10);
		}
		return x;
	}
	public static void main(String[] args) {
		System.out.println(generate(523));
	}
}
