package list;
import java.util.*;
import java.io.*;
public class Reverse {
	static Node root;
	static void rev(Node head){
		if(head==null){
			 return;
		}
		if(head.next==null){
			return;
		}
		
		Node prev=head;
		head=head.next;
		Node next=head.next;
		prev.next=null;
		head.next=prev;
		prev=next;
		while(true){
			next=head;
			head=prev;
			prev=next;
			if(head.next!=null){
				next=head.next;
				head.next=prev;
				prev=next;
			}
			else{
				head.next=prev;
				break;
			}
		}
		
		
		root=head;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("list.txt"));
		String[] inp=br.readLine().split("->");
		Node troot=root;
		for(String i:inp){
			if(root==null){
				root=new Node(Integer.parseInt(i));
				troot=root;
				
			}
			else{
				Node node=new Node(Integer.parseInt(i));
				troot.next=node;
				troot=node;
			}
		}
		troot=root;
		while(troot!=null){
			System.out.print(troot.data+" ");
			troot=troot.next;
		}
		rev(root);
		troot=root;
		System.out.println();
		while(troot!=null){
			System.out.print(troot.data+" ");
			troot=troot.next;
		}
	}

}
