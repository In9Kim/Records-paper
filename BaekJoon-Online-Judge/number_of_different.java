import java.util.*;
public class number_of_different {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		System.out.println(hansu1(in));
	}

	public static int hansu1(int in) {
		int[] arr = new int[3];
		int cnt = 0;

		for (int i = 1; i <= in; i++) {
			if (i == 1000)
				break;
			else if (i < 100)
				cnt++;
			else {
				int k = 0, t = i;
				while (t > 0) {
					arr[k] = t % 10;
					t /= 10;
					k++;
				}
				if (arr[0] - arr[1] == arr[1] - arr[2])
					cnt++;
			}
		}
		return cnt;
	}
}
