package tree;

import java.util.LinkedList;

public class LCA {
/*class	Node{
		Node left,right;
		int data;
		Node(int data){
			this.data=data;
		}
	}*/
static Node root;
static LinkedList<Node> l=new LinkedList<Node>();
static Node input=root;
	private static void input(int data){
		
	while(true){
		if(root==null){
			root=new Node(data);
			input=root;
			return;
		}
		if(input.left!=null){ l.add(input.left);}
		else{ input.left=new Node(data); return; }
		if(input.right!=null){l.add(input.right);}
		else{input.right=new Node(data); return;}
		input=l.removeFirst();
	}
	}
	public static int lca(Node troot,int f,int r){
		if(troot==null){
			return Integer.MIN_VALUE;
		}
		if(troot.data==f){
			return f;
		}
		if(troot.data==r){
			return r;
		}
		
	}
	public static void main(String[] args) {
		input(10);
		input(20);
		input(4);
		input(30);
		input(5);
		input(4);
		input(6);
		input(3);
		input(70);
		TreeIsBST.inOrder(root);
		System.out.println("\n"+lca(root,3,6));
	}

}
