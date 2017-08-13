package list;

import java.io.BufferedReader;
import java.io.IOException;

public class Array {
public static int[] input(BufferedReader br) throws IOException{
	String[] s=br.readLine().split(" ");
	int[] arr=new int[s.length];
	for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(s[i]);
	}
	return arr;
}
public static void print(int[] arr){
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		

	}

}
