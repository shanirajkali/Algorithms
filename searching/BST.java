package searching;
import java.io.*;
import java.util.*;
public class BST {
	int value;
	BST left,right;
	BST(){
		value=0;
		left=null;
		right=null;
	}
	int insertNode(BST node,int v){
		if(v>node.value){
			if(node.right==null){
				BST tem=new BST();
				tem.value=v;
				node.right=tem;
				if()
				return 0;
			}
			if(node.right!=null){
				insertNode(node.right,v);
			}
			
		}
		else if(v<=node.value){
			BST tem=new BST();
			tem.value=v;
			node.left=tem;
			return 0;
		}
	}
	boolean insert(BST root,int v){
		BST tem=new BST();
		tem.value=v;
		if(root.right==null){
			root.right=tem;
			return true;
		}
		else{
			insertNode(root.right,v);
		}
		return true;
	}
	public static void main(String[] args) throws IOException{
		BST root=new BST();
		BufferedReader br=new BufferedReader(new FileReader("./bst.txt"));
		Scanner kb=new Scanner(System.in);
		switch(1){
		case 1:
			System.out.println(root.insert(root,30));
			System.out.println(root.insert(root, 50));
			System.out.println(root.insert(root, 12));
			
		}
	}
}
