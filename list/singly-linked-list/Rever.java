package list;
import java.io.*;
import java.util.Arrays;

public class Rever {
	static Node root;
	static Node rev(Node head){
		if(head==null)	return head;
		if(head.next==null) return head;
		Node prev=head;
		head=head.next;
		Node next=head.next;
		prev.next=null;
		head.next=prev;
		while(next!=null){
			prev=head;
			head=next;
			if(head.next!=null){
				next=head.next;
				head.next=prev;
			}
			else{
				head.next=prev;
				next=null;
				
			}
		}
		
		return head;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("list.txt"));
		String[] inp=br.readLine().split("->");
		System.out.println(Arrays.toString(inp));
		Node troot=root;
		for(String i:inp){
			Node node=new Node(Integer.parseInt(i));
			if(root==null){
				root=node;
				troot=node;
			}
			else{
				troot.next=node;
				troot=node;
			}
		}
		troot=rev(root);
		while(troot!=null){
			System.out.print(troot.data+" ");
			troot=troot.next;
		}
	}

}
