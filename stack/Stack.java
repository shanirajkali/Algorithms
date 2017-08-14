package coding;

import java.util.*;

public class Stack {
    int size;
  int  top=-1;
    int[] stack=new int[size];
    void push(int a){
        top++;
        stack[top]=a;
    }
    int pop(){
        top--;
        return stack[top];
    }
  int getMax(){
      int max=stack[0];
      for(int i=1;i<=top;i++){
          if(max<stack[i])
              max=stack[i];
      }
      return max;
  }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack so=new Stack();
        System.out.println(so.top);
         so.size=sc.nextInt();
        
        if(so.size<1||so.size>100000)
            System.exit(0);
        int i=0;
        while(i<so.size){
            int j=sc.nextInt();
            if(j==1){
                int inp=sc.nextInt();
                so.push(inp);
            }
          else  if(j==2){
                so.pop();
            }
            else if(j==3){
                System.out.println(so.getMax());
            }
            i++;
        }
       
    }
}