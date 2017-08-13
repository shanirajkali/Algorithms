package backtracking;

public class FirstPattern {
	void pattern(char[] a,int p,int len){
		int i=0;
		while(i<len){
			i++;
			pattern(a,++p,len-1);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a={'A','B','C'};
		FirstPattern fp=new FirstPattern();
		fp.pattern(a,0,a.length);
	}

}
