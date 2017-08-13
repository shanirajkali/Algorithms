package list;
import java.util.Scanner;
class SinglyLLNode{
	public int vaue;
	public SinglyLLNode next;
}

public class SinglyLL {
	SinglyLLNode start=new SinglyLLNode();
	SinglyLLNode end;
public	int size=0;
public	SinglyLL(String str){
		SinglyLLNode temp=start;
		String[] strArr=str.split("\\s");
		for(String i:strArr){
			SinglyLLNode nod=new SinglyLLNode();
			nod.vaue=Integer.parseInt(i);
			temp.next=nod;
			temp=nod;
			end=temp;
			size++;
		}
	}
	public void insert(int a){
		SinglyLLNode nod=new SinglyLLNode();
		nod.vaue=a;
		end.next=nod;
		end=nod;
		size++;
	}
	public boolean deleteByPos(int pos){
		if(pos>size)
			return false;
		else{
			SinglyLLNode temp=start;
			int i=1;
			while(i<pos){
				i++;
				temp=temp.next;
				System.out.println(temp.vaue);
			}
			if(temp.next.next!=null){
				if(temp.next.next.next==null){
					end=temp.next.next;
				}
				temp.next=temp.next.next;
				
			}
			else{
				end=temp;
				temp.next=null;
				}
			size--;
			return true;
		
		}
	}
	public  void print(){
		SinglyLLNode temp=new SinglyLLNode();
		temp=start.next;
		while(temp!=null){
			System.out.print(" "+temp.vaue);
			temp=temp.next;
			
		}
		System.out.println();
	}
	SinglyLL(){
		
	}
	
	//driver
	public static void main(String[] args){
	long startTime=System.currentTimeMillis();
	Scanner in=new Scanner(System.in);
	SinglyLL ll=new SinglyLL("1 2 3 4 5 6 7 8 9 10 11");
aa:	while(true){
		System.out.println("your choice");
		System.out.println("1:del,2:print,3:size,4:insert");
		int n=in.nextInt();
		
		switch(n){
		case 1:{System.out.print("\n enter pos : ");int pos = in.nextInt();System.out.println(ll.deleteByPos(pos));}break;
		case 2:ll.print();break;
		case 3:System.out.println(ll.size);;break;
		case 4:{int a=in.nextInt();ll.insert(a);};break;
		default:break aa;
		}
	}
	System.out.println(System.currentTimeMillis()-startTime);
in.close();
	}
}