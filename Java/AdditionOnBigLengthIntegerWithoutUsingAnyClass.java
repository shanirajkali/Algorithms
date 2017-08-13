public class AdditionOnBigLengthIntegerWithoutUsingAnyClass
{
	String s1,s2;

	private int charIntToInt(int var){
			if(var==48){var=0;}
			else if(var==49){var=1;}
			else if(var==50){var=2;}
			else if(var==51){var=3;}
			else if(var==52){var=4;}
			else if(var==53){var=5;}
			else if(var==54){var=6;}
			else if(var==55){var=7;}
			else if(var==56){var=8;}
			else if(var==57){var=9;}
			return (var);}
	
	public void add(String ts1,String ts2){
		String resultstr="";
		s1=ts1;s2=ts2;
		if(s1.length()<s2.length()){
		String temp;
		temp=s1;
		s1=s2;
		s2=s1;
		}
		char[] c1=s1.toCharArray(),c2=s2.toCharArray();
	
		int[] a=new int[s1.length()];		
		for(int i=0;i<c1.length;i++){
			a[i]=(int)c1[i];
			a[i]=charIntToInt(a[i]);
			System.out.println(a[i]);
		}
		System.out.println();
		int[] b=new int[s2.length()];
		for(int j=0;j<c2.length;j++){
			b[j]=(int)c2[j];
			b[j]=charIntToInt(b[j]);
		System.out.println(b[j]);
		}
		System.out.println();
		
		
		int carry=0;
		for(int k=(c1.length-1),l=(c2.length-1);k>=0;k--){
			int tint=a[k]+b[l]+carry;
				int add=tint%10;
				carry=tint/10;
			if(l!=-1){
				if(((c1.length)==1||(c2.length)==1)){
					String tstr=Integer.toString(tint);
					resultstr=tstr;
				}else if(l==0&&((c1.length)>1||(c1.length)>1)){
					String tstr=Integer.toString(tint);
					resultstr=tstr+resultstr;
				}else{
					String tstr=Integer.toString(add);
					resultstr=tstr+resultstr;
				}
				
			l--;
			}
		}
		System.out.println(resultstr);
		System.out.println(resultstr.length());
		
}		
			public static void main(String[] args){
			Addition1 ob=new Addition1();
			ob.add("232300000000000000000000000000000000000000223230000000000000000000000000000000000000022323000000000000000000000000000000000000002","232300000000000000000000000000000000000000223230000000000000000000000000000000000000022323000000000000000000000000000000000000002");}
}