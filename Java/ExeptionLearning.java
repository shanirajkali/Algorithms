import java.io.*;//used for io exeption
class ExeptionLearning{
	public static void main(String[] args) //throws IOException //for IO exeption
	{
		/*try{
			System.out.println(3/0);
			System.out.println("in try");
		}
		catch(NullPointerException e){
			System.out.println("Exception: "+e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Exception: "+e.getMessage());
		}*/
		
		
		int balance=5000,withdrawlAmount=6000;
		//type 1
	
		/*	if(balance<withdrawlAmount){=
				throw new ArithmeticException("insufficient balance");
			}
			balance=balance-withdrawlAmount;
			System.out.println("Trans action successfully completed");
	*/
	

		//type 3
	/*	try{
			if(balance<withdrawlAmount){
				throw new ArithmeticException("insufficient balance");
			}
			balance=balance-withdrawlAmount;
			System.out.println("Transaction successfully completed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: low balance");
		}  
		finally{System.out.println("try again");}	*/
		
		//checked exeption
		try{
		throw new IOException();
		}
		catch(IOException e){System.out.println("exeption : "+e.getMessage());}
		System.out.println("check....");
	}
}