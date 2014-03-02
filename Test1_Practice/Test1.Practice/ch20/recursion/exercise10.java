package ch20.recursion;

public class exercise10 {
	int count = 0;
	public static int count(String str, char a) {
		return count(str, a, 0);
	}
	
	public static int count(String str, char a, int index) {
		if (index >= str.length()) {
			return 0;
		}
		int num = str.charAt(index) == a ? 1 : 0;
		return num + count(str, a, index + 1);
	}

}
