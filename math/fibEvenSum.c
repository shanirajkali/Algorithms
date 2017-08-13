#include<stdio.h>
int main(){
    int num, add,i;
    scanf("%d",&num);
    int arr[num];


    scanf("%d",&add);
    arr[0]=1;
    arr[1]=2;
    for(i=2;i<num;i++){
        arr[i]=arr[i-1]+arr[i-2];

    }
    for(i=0;i<num;i++){
        printf("%d ",arr[i]);
    }






















    int sum=0,temp=0;
    for(i=0;i<num;i++){

        if(((arr[i]%2)==0)&&(sum<add)){
             temp=temp+arr[i];
        if(temp<add){

                sum=sum+arr[i];
        }
        }
    }
    printf("\n\n%d",sum);
return 0;
}
