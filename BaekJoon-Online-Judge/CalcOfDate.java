import java.util.*;
public class CalcOfDate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int E = input.nextInt();
		int S = input.nextInt();
		int M = input.nextInt();
		
		int cnt=0;
		
		while(true) {
			/*
			 * 중국인의 나머지 정리 방법 이용
			 * 예제 입력에서 1 2 3을 입력했을 경우로 가정하고 계산해봄
			 * 가장 빠른 연도는 5266년도이다.
			 * 15로 5266을 나눴을 때 나머지는 1이다.
			 * 28로 5266을 나눴을 때 나머지는 2다.
			 * 19로 5266을 나눴을 때 나머지는 3이다.
			 * 532x = 1 mod 15 = E_tmp
			 * 285x = 2 mod 28 = S_tmp
			 * 420x = 3 mod 19 = M_tmp
			 * 532, 285, 420은 E, S, M의 최소공배수인 7980을 각 숫자로 만들 수 있는 값
			 * 무한 반복문을 통해 계산한 다음 입력 값과 동일해지면 정지
			 */
			int E_tmp = cnt%15+1;
			int S_tmp = cnt%28+1;
			int M_tmp = cnt%19+1;
			if(E==E_tmp&&S==S_tmp&&M==M_tmp) break;
			cnt++;
		}
		System.out.println(cnt+1);
	}
}
