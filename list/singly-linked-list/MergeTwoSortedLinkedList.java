package list;
import java.io.*;
public class MergeTwoSortedLinkedList {
	static Node input(BufferedReader br) throws IOException{
		String[] s=br.readLine().split(" ");
		Node head=null;
		Node head1=head;
		for(int i=0;i<s.length;i++){
			if(head1==null){
				head=new Node(Integer.parseInt(s[i]));
				head1=head;
				continue;
			}
			head1.next=new Node(Integer.parseInt(s[i]));
			head1=head1.next;
		}
		return head;
	}
	static Node merge(Node head1,Node head2){
		Node head=null;
		Node temp=head;
		if(head1.data<head2.data){
			head=head1;
			head1=head1.next;
			temp=head;
		}
		else{
			head=head2;
			head2=head2.next;
			temp=head;
		}
		while(true){
			if(head1!=null){
				if(head2!=null){
					if(head1.data<=head2.data){
						temp.next=head1;
						head1=head1.next;
						temp=temp.next;
					}
					else{
						temp.next=head2;
						System.out.println(head2);
						head2=head2.next;
						temp=temp.next;
					}
				}
				else{
					temp.next=head1;
					head1=head1.next;
					temp=temp.next;
				}
			}
			else if(head2!=null){
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
			else return head;
		}
	}
	static void print(Node th){if(th!=null){System.out.print(" "+th);print(th.next);}}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("src/list/list.txt"));
		Node head1=input(br);
		Node head2=input(br);
		print(head1);
		System.out.println();
		print(head2);
		Node head=merge(head1,head2);
		System.out.println();
		print(head);
		br.close();
	}
}