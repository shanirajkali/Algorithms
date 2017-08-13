package searching;
import java.util.*;
import java.io.*;

public class Binary {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("./searching.txt"));
		int[] arr=new int[Integer.parseInt(br.readLine())];
		String[] sarr=br.readLine().split("\\s");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(sarr[i]);
		}
		int search=Integer.parseInt(br.readLine());
		int start=0,end=arr.length-1,mid=(start+end)/2,i=0;
		while(i<20){
			if(arr[mid]==search){
				System.out.println(arr[mid]+" Found at "+mid);
				break;
			}
			else if(search<arr[mid]){
				end=mid-1;	
				}
			else if(search>arr[mid]){
				start=mid+1;}
			if((start>end)||(end<start))
			{
				System.out.println("not found");
				break;
				
			}
			mid=(start+end)/2;
		}
		
	}

}
