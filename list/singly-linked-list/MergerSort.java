package list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MergerSort {
	public static void merge(int[] arr,int l,int m,int r){
		System.out.println(l+" "+m+" "+r);
		int[] left=new int[m-l+2];
		int[] right=new int[r-m+1];
		left[left.length-1]=Integer.MAX_VALUE;
		right[right.length-1]=Integer.MAX_VALUE;
		for(int i=0,j=l;i<left.length-1;i++,j++){
			left[i]=arr[j];
		}
		for(int i=0,j=m+1;i<right.length-1;i++,j++){
			right[i]=arr[j];
		}
		for(int i=l,j=0,k=0;i<=r;i++){
			if(left[j]<=right[k]){
				arr[i]=left[j];
				j++;
			}
			else{
				arr[i]=right[k];
				k++;
			}
		} 
	}
public static void mergeSort(int[] arr,int l,int r){
	if(l<r){
		int m=(l+r)/2;
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);
		merge(arr,l,m,r);
	}
}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("src/list/list.txt"));
		int[] arr=Array.input(br);
		Array.print(arr);
		mergeSort(arr,0,arr.length-1);
		Array.print(arr);
		br.close();
	}

}
