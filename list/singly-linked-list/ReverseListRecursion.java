package list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseListRecursion {

	static  Node rev(Node head,Node next){
		if(next==null)
			return head;
		Node re=rev(head.next,next.next);
		next.next=head;
		head.next=null;
		return re;}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("src/list/list.txt"));
		Node head=MergeTwoSortedLinkedList.input(br);
		MergeTwoSortedLinkedList.print(head);
		System.out.println();
		head=rev(head,head.next);
		System.out.println();
		MergeTwoSortedLinkedList.print(head);
		head=rev(head,head.next);
		System.out.println();
		System.out.println();
		MergeTwoSortedLinkedList.print(head);
		
		
	}
}
