import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = 0, Y = 0, cnt = 0;
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		while (true) {
			X = input.nextInt();
			Y = input.nextInt();
			if ((X >= 1 && X <= 12) && (Y >= 1 && Y <= 31)) {
				break;
			}
		}
		for (int i = 1; i < X; i++) {
			if (i == 2)
				cnt = cnt + 28;
			else if (i == 4 || i == 6 || i == 9 || i == 11)
				cnt = cnt + 30;
			else
				cnt = cnt + 31;
		}
		cnt+=Y;
		System.out.println(day[cnt%7]);
	}
}
