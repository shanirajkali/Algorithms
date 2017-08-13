package list;
import java.util.Scanner;
class Node{
	int value=0;
	Node link=null;
	public void Node(){
		value=0;
		link=null;
	}
}
class Main{
	static int length=0;
	 private void trav(int n,int m,Node start){
		 if(n>0){
			 n--;
			 start=start.link;
			 trav(n,m,start);
			 
		 }
	 }
	protected void traverse(int n,int m,Node start){
		if(n>m){
			 
			 trav(n,m,start);
			
			 
		}
	}
	
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		Node start=new Node();
		
		while(true){	
			System.out.println("1:traverseSpecific  2:isertAtSpecific");
			System.out.println("3:deleteSpecific 0:break");
			int operation=inp.nextInt();
			if(operation==0){
				break;
			}
			else if(i==1){
				System.out.println("Chose location from N to M or M to N \nboth between inclusive range 1 to "+length);
				System.out.println("choose N: ");
				int n=inp.nextInt();
				System.out.println("choose M: ");
				int m=inp.nextInt();
				start.traverse(n,m,start);
			}
		}
		
	}
}