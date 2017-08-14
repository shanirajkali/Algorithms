package coding;
import java.util.*;
public class Queue {

	public static void main(String[] args) {
		int size=5;
		int[] q=new int[size];
		int front=-1;
		int rear=-1;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("\n1:push 2:pop 3:print else:exit");
			int i=sc.nextInt();
			if(i==1){
				if(rear<size-1){
					q[++rear]=sc.nextInt();
				}
				else 
					System.out.println("full");
			}
			else if(i==2){
				if(front<rear){
					System.out.println(q[++front]);
					
				}
			}
			else if(i==3){
				for(int j=front+1;j<=rear;j++){
					System.out.println(q[j]);
				}
			}
			else {
				break;
			}
		}
		
	}
}