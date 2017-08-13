package heap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MinHeap {
	static void buildHeap(int[] heap){
		for(int i=(heap.length-1)/2;i>0;i--){
			minHeapify(heap,i);
		}
	}
	static void minHeapify(int[] heap,int index){
		if(index>(heap.length-1)/2){
			return;
		}
		int l=index<<1;
		int r=(index<<1)+1;
		if(heap[l]<=heap[r]){
			if(heap[index]>heap[l]){
				heap[index]^=heap[l];heap[l]^=heap[index];heap[index]^=heap[l];
				minHeapify(heap,l);
				return;
			}
		}
		else{
			if(heap[index]>heap[r]){
				heap[index]^=heap[r];heap[r]^=heap[index];heap[index]^=heap[r];
				minHeapify(heap,r);
				return;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("src/heap/heap.txt"));
		int[] heap=new int[Integer.parseInt(br.readLine())+1];
		String s[] =br.readLine().split(" ");
		for(int i=1;i<heap.length;i++){
			heap[i]=Integer.parseInt(s[i]);
		}
		 buildHeap(heap);
		System.out.println(Arrays.toString(heap));
		br.close();
	}

}
