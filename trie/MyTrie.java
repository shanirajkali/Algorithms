package trie;
import java.util.Map;
import java.util.HashMap;

public class MyTrie {
	class Node{
		Map<Character,Node> ch;
		boolean exist;
		Node(){
			ch=new HashMap<>();
			exist =false;
		}
	}
	Node root=new Node();
	public void insert(String str){
		Node toot=root;
		for(int i=0;i<str.length();i++){
			Node temp=toot.ch.get(str.charAt(i));
			if(temp==null){
				Node put=new Node();
				toot.ch.put(str.charAt(i), put);
				System.out.print(" "+str.charAt(i));
				toot=put;
			}
			else {
				toot=temp;
			}
		}
		toot.exist=true;
	}
	boolean exist(String str){
		Node temp=root;
		for(int i=0;i<str.length();i++){
			temp=temp.ch.get(str.charAt(i));
			if(temp==null){
				return false;
			}
			
		}
		return temp.exist;
		
	}
	public static void main(String[] args) {
	//driver
		MyTrie mt=new MyTrie();
		mt.insert("shani");
		System.out.println();
		mt.insert("raj");
		System.out.println();
		System.out.println(mt.root.ch.size());
		
	}

}
