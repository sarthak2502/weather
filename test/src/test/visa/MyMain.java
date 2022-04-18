package test.visa;

public class MyMain {

	public static void main(String[] args) {

		String str = "AAAABBAAACCCAA";

		String res = ""; //4A2B2A3C2A
		Integer count = 1;
		Character c = str.charAt(0);
		for (int i=1; i<str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			} else {
				res += count + String.valueOf(c);
				count = 1;
				c = str.charAt(i);
			}
		}
		res += count + String.valueOf(c);
		System.out.println(res);

	}

}
