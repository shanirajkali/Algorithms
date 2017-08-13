package lambdas;

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLambda hi=() -> System.out.println("hello lambdaa");
		hi.hello();
		
	}

}
interface MyLambda{
	void hello();
	int mul(int s);
}