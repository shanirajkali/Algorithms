package stack;
import java.util.*;

public class PopElementInO1 {
	static int minEle;
	public static void push(Stack<Integer> stack,int a){
		if(stack.isEmpty()){
			minEle=a;
			stack.push(a);
		}
		if(a<minEle){
			stack.push(a*2-minEle);
			minEle=a;
		}
		else stack.push(a);
	}
	
	public static int pos(Stack<Integer> stack){
		if(stack.isEmpty()){
			return Integer.MIN_VALUE;
		}
		int p=stack.pop();
		int re=p;
		if(p<minEle){
			re=minEle;
			minEle=2*minEle-p;
		}
		return re;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
