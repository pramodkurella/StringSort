import java.util.Arrays;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String s1 = sc.nextLine();

		char[] d = s.toCharArray();
		char[] e = s1.toCharArray();

		Arrays.sort(d);
		Arrays.sort(e);

		String a = new String(d);
		String a1 = new String(e);

		if (a.length() != a1.length()) {
			System.out.println("NO");
		} else if (a.contains(a1)) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}

	}

}
