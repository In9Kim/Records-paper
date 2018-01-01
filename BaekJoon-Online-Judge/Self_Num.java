import java.util.*;
public class Self_Num {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		for(int i=0;i<=10000;i++) {
			list.add(calc(i));
		}
		for(int i=0;i<=10000;i++) {
			if(!list.contains(i)) {
				System.out.println(i);
			}
		}
	}
	public static Integer calc(int num) {
		int rst=0;
		rst+=num;
		String str = String.valueOf(num);
		for(int i=0;i<str.length();i++) {
			rst+=Integer.parseInt(str.substring(i,i+1));
		}
		return rst;
	}
}
