package tree;

public class AVL {
	static Node root;
	
	public static Node leftRotate(Node root){
		if(root.right==null){
			return root;
		}
		Node temp=root.right;
		root.right=root.right.left;
		temp.left=root;
		 
		return root;
	}
	
	public static int height(Node node){
		if(node==null)
			return 0;
		return node.height;
	}
	
	public static int balance(Node left,Node right){
		return height(left)-height(right);
	}
	
	public static int setHeight(Node root){
		if(root==null)
			return 0;
		return Math.max((root.left!=null?root.left.height:0), (root.right!=null?root.right.height:0));
	}
	
	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		if(data>root.data){
			root.right=insert(root.right,data);
		}
		else{
			root.left=insert(root.left,data);
		}
		int balance=balance(root.left,root.right);
		if(balance<-1){
			if(height(root.right.right)>=height(root.right.left))
				root=leftRotate(root);
			else{
				root=rigthRotate(root);
				root=leftRotate(root);
			}
		}
		root.height=setHeight(root);
	}
}