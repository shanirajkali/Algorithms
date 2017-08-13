package backtracking;

public class Table {
	int fact(int n){
		if(n>1)
			return n*fact(--n);
		return 1;
	}
	void able(int n,int i){
		if(i>1)
		{	able(n,--i);
		System.out.println(n*i);}
	}
	public static void main(String[] args) {
		Table t=new Table();
		t.able(10, 11);
		
		System.out.println(t.fact(5));
	}

}
