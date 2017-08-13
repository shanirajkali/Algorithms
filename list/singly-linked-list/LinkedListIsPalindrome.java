package list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinkedListIsPalindrome {
	static int ch=1;
	static Node isPalindrome(Node first,Node head){
		if(head==null)
			return first;
		Node f=isPalindrome(first,head.next);
		if(f.data!=head.data){
			ch=0;
		}
		return f.next;
				
	}
	
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("src/list/list.txt"));
	Node head=MergeTwoSortedLinkedList.input(br);
	MergeTwoSortedLinkedList.print(head);
	isPalindrome(head, head);
	System.out.println();
	System.out.println(ch);
	br.close();
	}

}
