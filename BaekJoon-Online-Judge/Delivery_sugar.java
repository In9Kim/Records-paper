import java.util.*;


public class Delivery_sugar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = 0;
		int flag = 0;

		if (A < 3 && A > 5000) {
			flag = 1;
		}

		while (A % 5 != 0) {

			if (A > 5 || A == 3) {
				A = A - 3;
				B++;
			} else {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println((A / 5) + B);
		} else {
			System.out.println(-1);
		}

	}
}
