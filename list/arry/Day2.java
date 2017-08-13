package matrix;
import java.util.*;
public class Day2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String inp[]=(in.nextLine().split("\\s"));
		int arrSize=Integer.parseInt(inp[0]);
		int unit=Integer.parseInt(inp[1]);
		int second=Integer.parseInt(inp[2]);
		int i=0;
		int[] arr=new int[arrSize];
		while(i<arrSize){
			arr[i]=in.nextInt();
			i++;
		}
		Arrays.sort(arr);
		int kill=0;
		int j=0;
		for(i=second;i>0;){
			i=i-(arr[j]/unit);
			if(arr[j]%unit!=0){
				i--;
			}
			kill++;
			j++;
		}
		System.out.println(kill);
	}
}
