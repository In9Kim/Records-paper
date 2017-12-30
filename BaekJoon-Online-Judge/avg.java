import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 0, max = 0, cnt = 0;
		double avg = 0.00, sum = 0.00;
		int[] arr;
		while (true) {
			N = input.nextInt();
			if (N <= 1000) {
				break;
			}
		}
		arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		max = arr[N - 1];
		for (int i = 0; i < arr.length; i++) {
			sum += (double) arr[i] / max * 100;
		}

		avg = sum / arr.length;
		System.out.printf("%.2f", avg);
	}
}
