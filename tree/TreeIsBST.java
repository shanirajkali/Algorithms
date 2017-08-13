package tree;
public class TreeIsBST {
	static Node root;
	
	public static void insert(int data,Node troot){

		if(root==null){
			root=new Node(data);
			troot=root;
			return; }
		
	
		if(data>troot.data){
			if(troot.right!=null) insert(data,troot.right);
			else { troot.right=new Node(data); return ;}
		}
		
		if(data<troot.data){
			if(troot.left!=null) insert(data,troot.left);
			else { troot.left=new Node(data); return; }
		}
		
		return;
	}
	
	public static void inOrder(Node root){
		if(root==null) return;
		if(root.left!=null) inOrder(root.left);
		System.out.println(root.data);
		if(root.right!=null) inOrder(root.right);
	}
	
	public static boolean left(Node temp,int d){
		if(temp==null) return true;
		if(temp.data<d){
			left(temp.left,d);
			left(temp.right,d);
			return true;
		}
		
		return false;
	}
	public static boolean right(Node temp,int d){
		if(temp==null) return true;
		if(temp.data>d){
			right(temp.left,d);
			right(temp.right,d);
			return true;
		}
		return false;
	}
	
	public static boolean checkBST(Node troot){
		if(troot==null){
			return true;
		}
		if(left(troot.left,troot.data)&&right(troot.right,troot.data)){
			checkBST(troot.left);
			checkBST(troot.right);
			return true;
		}
		 return false;
	}
	
	public static void main(String[] args) {
		insert(10,root);
		insert(20,root);
		root.right.data=4;
		insert(30,root);
		insert(5,root);
		insert(4,root);
		insert(6,root);
		insert(3,root);
		insert(70,root);
		inOrder(root);
		System.out.println(checkBST(root));
		
	}
}
