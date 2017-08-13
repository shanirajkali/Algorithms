package math;

import java.util.HashSet;

public class DivisiblityBy3Numbers {

	public static void main(String[] args) {
			HashSet<Integer> s=new HashSet<Integer>();
			int a=2,b=3,c=4;
			int num=15;
			int m=1;
			while(a*m<=num){
				s.add(a*m);
				m++;
			}
			m=1;
			while(b*m<=num){
				s.add(b*m);
				m++;
			}
			m=1;
			while(c*m<=num){
				s.add(c*m);
				m++;
			}
			m=1;
			while(a*b*m<=num){
				s.add(a*m*b);
				m++;
			}
			m=1;
			while(a*b*c*m<=num){
				s.add(a*b*c*m);
				m++;
			}
			m=1;
			while(b*c*m<=num){
				s.add(b*c*m);
				m++;
			}
			m=1;
			while(a*c*m<=num){
				s.add(a*c*m);
				m++;
			}
			System.out.println(s.size());
	}

}
