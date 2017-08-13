package queue;

import java.util.Arrays;

public class Queue {
	static int front=-1,rear=0;
	Queue(){
		front=-1;rear=0;
	}
	public static boolean add(int[] queue,int ele){
		if(rear<queue.length&&rear>front){
			System.out.println("sd");
			queue[rear]=ele;
			rear++;
			return true;
		}
		else if(rear==queue.length&&front>-1){
			rear=0;
			queue[rear]=ele;
			return true;
		}
		else if(rear<front){
			rear++;
			queue[rear]=ele;
			return true;
			
		}
		
		System.out.println(front+" "+rear);
		return false;
		
	}
	public static int remove(int[] queue){
		if(front<rear){
			front++;
			int f=queue[front];
			queue[front]=Integer.MIN_VALUE;
			return f;
		}
		else if(front==queue.length-1 ){
			return Integer.MIN_VALUE;
		}
		else if(front>rear){
			front=0;
			int f=queue[front];
			queue[front]=Integer.MIN_VALUE;
			return f;
		}
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
			int[] queue=new int[5];
			for(int i=0;i<queue.length;i++){
				queue[i]=Integer.MIN_VALUE;
			}
			System.out.println(add(queue,1)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,2)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,3)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,4)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,5)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,6)+"  " +Arrays.toString(queue));
			System.out.println(remove(queue)+"  "+Arrays.toString(queue));
			System.out.println(add(queue,6)+"  " +Arrays.toString(queue));
			System.out.println(remove(queue)+"  "+Arrays.toString(queue));
			System.out.println(add(queue,6)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,6)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,6)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,7)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,8)+"  " +Arrays.toString(queue));
			System.out.println(add(queue,9)+"  " +Arrays.toString(queue));
			

	}

}
