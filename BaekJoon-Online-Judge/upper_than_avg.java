import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0, avg = 0, cnt = 0;
		int tot = input.nextInt();
		int[][] arr = new int[tot][];
		for (int i = 0; i < tot; i++) {
			int mount = input.nextInt();
			arr[i] = new int[mount];
			for (int j = 0; j < mount; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < tot; i++) {
			sum = 0;
			avg = 0;
			cnt = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			avg = sum / arr[i].length;
			for (int j = 0; j < arr[i].length; j++) {
				if (avg < arr[i][j])
					cnt++;
			}
			System.out.printf("%.3f%% \n", (double) ((cnt * 100) / (arr[i].length)));
		}
	}
}
