#include<stdio.h>
int main(){
int a,b,c,steps,i,t;
printf("A : ");scanf("%d",&a);
printf("B : ");scanf("%d",&b);
printf("Steps : ");scanf("%d",&steps);
printf("%d  %d",a,b);
for (i=0;i<steps;i++)
{
    c=a+b;
    printf("  %d",c);
    b=c;
    a=c-a;


}

}
