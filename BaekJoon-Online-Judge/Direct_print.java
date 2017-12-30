import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String [] arr = new String[100];
        int count = 0;
        while(input.hasNextLine()){
			arr[count] = input.nextLine();
			if(arr[count].startsWith(" ")||arr[count].endsWith(" ")||arr[count].isEmpty()||arr[count].length()>100){
        		break;
        	}
			count++;
		}
		for(int j=0;j<count;j++){
        	System.out.println(arr[j]);
        }
    }
}
