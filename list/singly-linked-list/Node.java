package coding;
import java.util.Scanner;

public class Node {
int val;
Node node;
Node(){
	val=0;
	node=null;
}

public String toString(){
return "value:"+val+" contains node:"+node;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node start=new Node();
		Node last=new Node();
		while(true){
			System.out.println("1:insert node , 2:delete node  , 3:view list");
			System.out.print("value: ");
			int i=sc.nextInt();
			if(i==1){
			Node insert=new Node();
			insert.val=sc.nextInt();
			if(start.node==null){
				start.node=insert;
				last.node=insert;
			}
			else{
				last.node.node=insert;
				last.node=insert;
			}
			}
			else if(i==2)
			{
				Node delete=new Node();
				delete.node=start.node;
				while(delete.node.node!=null)
				{
					delete.node=delete.node.node;
					System.out.println("dele");
				}
				delete.node.node=null;
			}
			else if(i==3){
				Node print=new Node();
				print.node=start.node;
				while(print.node!=null){
					System.out.println(print.node.val);
					print.node=print.node.node;
				}
			}
			else
				break;
		}
		sc.close();
	}
	

}
