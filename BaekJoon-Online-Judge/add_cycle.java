package Baekjoon;

import java.util.*;

public class add_cycle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();

		int left = in / 10;
		int left_tmp = left;

		int right = in % 10;
		int right_tmp = right;

		int cnt = 0, sum = 0;

		while (true) {

			sum = left_tmp + right_tmp;
			left_tmp = right_tmp;
			right_tmp = sum % 10;
			cnt++;

			if (left == left_tmp && right == right_tmp) {
				System.out.println(cnt);
				break;
			}
		}
	}
}
