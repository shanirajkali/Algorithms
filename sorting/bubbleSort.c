#include<stdio.h>
int main(){
    int size;
    printf("Elements: ");
    scanf("%d",&size);

    int arr[size],i,temp,j;
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        if(arr[i]>arr[j])
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    printf("\n\n");
    for(i=0;i<size;i++){
    printf("  %d",arr[i]);
    }

return 0;}
