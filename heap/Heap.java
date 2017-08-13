package heap;
public class Heap {
static	void minHeapify(int[] arr,int n,int i){
		int larg=i,min=i<<1;
		if((i<<1)+1<=n){
			if(arr[(i<<1)]<arr[(i<<1)+1])
				min=i<<1;
			else
				min=(i<<1)+(1);
		}
		if(i<<1<=n){ 
			if(arr[i]>arr[min]){
				arr[i]^=arr[min];
				arr[min]^=arr[i];
				arr[i]^=arr[min];
				larg=min;
			}
		}
		if(larg!=i)
			minHeapify(arr,n,min);
	}
static	void buildHeap(int[] arr,int n){

		for(int i=n>>1;i>=1;i--){
			System.out.println("rs  "+i);
			minHeapify(arr,n,i);
		}
		n--;
	}
static int extractMin(int[] arr,int n){
	arr[1]=arr[n];
	n--;
	minHeapify(arr,n,1);
	return n;
}
	
	public static void main(String args[]){
	int[] arr={Integer.MAX_VALUE,14,18,5,50,64,53,43,87,32,41,23,90};
	int n=arr.length-1;
	buildHeap(arr,arr.length-1);
	System.out.println("size  "+n);
	for(int i=1;i<=n;i++){
		System.out.println(arr[i]);
	}
}
}