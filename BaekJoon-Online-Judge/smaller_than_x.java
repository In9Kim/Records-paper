import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr;
		ArrayList tmp = new ArrayList();
		int N = 0, X = 0, flag = 0,cnt=0;
		while (true) {
			N = input.nextInt();
			X = input.nextInt();
			if (N >= 1 && X <= 10000)
				break;
		}
		arr = new int[N];
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = input.nextInt();
				if (arr[i] < X) {
					flag = 1;
					tmp.add(arr[i]);
				}
			}
			if (flag == 1) { 
				for(int i=0;i<tmp.size();i++) {
					System.out.print(tmp.get(i)+" ");
				}
				break;
			}
			else {
				Arrays.fill(arr, 0);
			}
		}
	}
}
