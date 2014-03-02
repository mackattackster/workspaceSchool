package ch20.recursion;

public class exercise11 {
	static int temp = 0;
	public static int sumDigits(long n) {
		if (n % 10 != 0) {
			temp += n % 10 + sumDigits(n / 10);	
		}
		return temp;
	}
	
}
