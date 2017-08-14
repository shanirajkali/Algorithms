package coding;
import java.util.Scanner;

public class BFS {
	int nodes;
	
	int[] q=new int[nodes];
	int rear=-1,front=-1;
	
	void push(int a){
			rear++;
			q[rear]=a;
		
	}
	boolean isEmpty(){
		if(front>rear){
			return true;
		}
		else
			return false;
	}
	boolean isFree(){
		if(rear<q.length-1)
			return true;
		else 
			return false;
	}
	int pop(){
			front++;
		return q[front-1];	
		
	}
	String getQueue(){
		String queue="";
		if(!isEmpty()){
			for (int i=front;i<rear;i++){
				queue=queue+" "+String.valueOf(q[i]);
			}
		}
		return "Queue is empty";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nodes: ");
		BFS bfs=new BFS();
		bfs.nodes=sc.nextInt();	

		System.out.println(bfs.front);
		int[] visitedNodes=new int[bfs.nodes+1];	
		int[][] paths=new int[bfs.nodes+1][bfs.nodes+1];
		
		System.out.print("enter how many pathes you hava : ");
		int pathNo=sc.nextInt();
		int i=0;
		System.out.println(paths[0][0]);
		while(i<pathNo){
			System.out.println("enter reachable path : ");
			int p1=sc.nextInt();
			int p2=sc.nextInt();
			paths[p1][p2]=1;
			i++;
		}
		int[] traverse=new int[bfs.nodes];
		bfs.push(1);
		visitedNodes[1]=bfs.pop();
		traverse[0]=1;
		for(i=traverse[i];i<=bfs.nodes;){
			for(int j=1;i<=bfs.nodes;j++){
				if(paths[i][j]==i&&visitedNodes[j]==0){
					visitedNodes[j]=1;
					bfs.push(j);
				}
			}
			i++;
			traverse[i]=bfs.pop();
		}
		for(i=0;i<traverse.length;i++){
			System.out.println(traverse[i]);
		}
			
		sc.close();
		System.out.println("BFS Begins");
	}

}
