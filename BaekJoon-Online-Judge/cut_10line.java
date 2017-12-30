import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in = null;
		boolean lower = false, upper = false;
		while (true) {
			in = input.next();
			lower = Pattern.matches("^[a-z]*$", in);
			upper = Pattern.matches("^[a-zA-Z]*$", in);
			if (in.length() > 0 && in.length() <= 100 && (lower == true || upper == true)) {
				break;
			}
		}
		for (int i = 0; i < in.length(); i += 10) {
			if (i + 10 < in.length()) {
				System.out.println(in.substring(i, i + 10));
			} else {
				System.out.println(in.substring(i));
			}
		}
	}
}
