package list;

import java.util.ArrayList;
import java.util.Iterator;


public class MyArrayList {
	
	   public boolean isPalindrome(String original){
	        int i = original.length()-1;
	        int j=0;
	        while(i > j) {
	            if(original.charAt(i) != original.charAt(j)) {
	                return false;
	            }
	            i--;
	            j++;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	//	System.out.println(al.size());
		al.add("Shtni");
		al.add("raj");
		al.add("kali");
		al.add("chinky");
		al.add("vijai");
		Iterator itr=al.iterator();
		itr.next();
		System.out.println(al);
		MyArrayList ma=new MyArrayList();
		System.out.println(ma.isPalindrome("ABA"));
	}

}
