import java.util.Scanner;
class EvenOddSwap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int evenPoi,oddPoi,mod;
		int[] num=new int[sc.nextInt()];
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
			//System.out.println();
			//System.out.println(num[i]);
			mod=num[i]%2;
			
			if(mod==0&&i>0){
				for(int j=i-1;j>=0;j--){
				int newMod=num[j]%2;
				if(newMod==0){
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
					break;
				}
			}
			}
			else if(mod!=0&&i>0){
				for(int j=i-1;j>=0;j--){
				int newMod=num[j]%2;
				if(newMod!=0){
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
					break;
				}
			}
			}
			
		}
		System.out.println();
		System.out.println();
		
		for(int k=0;k<num.length;k++)
		{System.out.print(num[k]);}
	}
}