package coding;

import java.util.Scanner;

public class Solution {
	  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
         int size=sc.nextInt();
        int top=-1;
        int start=0;
        int max=0;
        int[] stack=new int[size];
        if(size<1||size>100000)
            System.exit(0);
        int i=0;
        while(i<size){
            int j=sc.nextInt();
            if(j==1){
                top++;
               stack[top]=sc.nextInt();
                
           
              }
            else  if(j==2){
                top--;
                
                    start=0;
            }
            else if(j==3){
            	int l=start;
                while(l<=top){
                  if(stack[l]>max){
                	  max=stack[l];
                  }
             
                  l++;
                 
                }
                start=top+1;
                System.out.println(max);
            }
            i++;
        }
       
    }
}