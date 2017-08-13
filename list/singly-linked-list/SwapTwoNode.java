package list;
import java.util.*;
public class SwapTwoNode {
	static Node root;
	static void swap(int a,int b){
		Node na=root,nb=root;
		 na.next=root;nb.next=root;
		Node thead=root;
		while(thead.next!=null){
			if(thead.next.data==a){
				na=thead;
			}
			if(thead.next.data==b)
				nb=thead;
			if(thead.next!=null)
			thead=thead.next;
			else break;
		}
		Node tna=na.next,tnb=nb,ttnb=nb.next.next;
		Node ttna=na.next;
		na.next=nb.next;
		na.next.next=tna.next;
		nb.next=null;
		nb.next=ttna;
		ttna.next=ttnb;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=in.nextLine().split(" ");
		if(root==null){
			root=new Node(Integer.parseInt(s[0]));
		}
		Node thead=root;
		int i=0;
		while(i<s.length-1){
			i++;
			thead.next=new Node(Integer.parseInt(s[i]));
			thead=thead.next;
		}
		thead=root;
		while(thead!=null){
			System.out.println(thead.data+" "+thead);
			thead=thead.next;
		}
		swap(1,6);
		System.out.println();
		thead=root;
		while(thead!=null){
			System.out.println(thead.data+" "+thead);
			thead=thead.next;
		}
		
	}
}
