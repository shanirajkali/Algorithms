package dynamic;
public class Factorial {
	static long fact(long[] arr,int num){
		if(arr[num]!=0)
			return arr[num];
		if(num==1) return 1;
		arr[num]= (num*fact(arr,num-1));
		return arr[num];
	}
	public static void main(String[] args) {
		long[] arr=new long[1011];
		System.out.println(fact(arr,5));
		System.out.println(arr[5]);
		System.out.println(fact(arr,10));
		System.out.println(arr[10]);
		System.out.println(fact(arr,5));
		System.out.println(arr[5]);
		System.out.println(fact(arr,6));
		System.out.println(arr[10]);
		System.out.println(fact(arr,1000));
		System.out.println(arr[30]);
	}
}