package tree;
import java.util.LinkedList;

class Node{
	int data;
	Node left,right;
	Node(int data){
		left=null;
		right=null;
		this.data=data;
	}
}

public class CheckForBSTinN {
	static Node root;
	static Node input=root;

	
	static void input(int data,Node troot){
		LinkedList<Node> q=new LinkedList<Node>();
		while(true){
		if(troot==null){
			troot=new Node(data);
			root=troot;
			return;
		}
		if(troot.left!=null){
			q.add(troot.left);
		}
		else{
			troot.left=new Node(data);
			return ;
		}
		if(troot.right!=null){
			q.add(troot.right);
		}
		else{
			troot.right=new Node(data);
			return;
		}
		troot=q.removeFirst();}
	}
	public static void main(String[] args) {
		input(50,root);
		input(40,root);
		input(100,root);
		input(30,root);
		input(45,root);
		input(70,root);
		input(110,root);
		input(25,root);
		TreeIsBST.inOrder(root);
	 	System.out.println(TreeIsBST.checkBST(root));		
		//System.out.println(root.left.left.left.data+" "+root.left.data+" "+root.right.data+" "+root.left.left.data+" "+root.left.right.data);
	}
}
