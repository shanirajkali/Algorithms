package dynamic;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class LIS {
	public static int[] nSquare(int[] arr){
		//this function does find longest increasing subsequence in O(n*n)
		int[] incFreq=new int[arr.length];
		int max=1;
		incFreq[arr.length-1]++;
		for(int i=arr.length-2;i>=0;i--){
			int currMax=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					if(incFreq[i]<=incFreq[j])
						incFreq[i]=incFreq[j];
				}
			}
			incFreq[i]++;
			max=Math.max(incFreq[i], max);
		}
		return incFreq;
	}

	public static void main(String[] args) {
		int[] arr={68,35, 1, 70, 25, 79, 59, 63, 65, 6 ,46 ,82};
		System.out.println(Arrays.toString(nSquare(arr)));
		IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
		System.out.println(stat);
			}

}
