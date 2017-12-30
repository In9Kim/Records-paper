import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String [] arr = new String[100];
        int count = 0;
        while(input.hasNextLine()){
            arr[count]=input.nextLine();
            if(arr[count].length()>100){
                break;
            }
            count++;
        }
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
    }
}
