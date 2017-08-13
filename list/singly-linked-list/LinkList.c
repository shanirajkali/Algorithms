#include<stdio.h>
#include<stdlib.h>
struct node{
    int info;
    struct node *link;};
struct node *start=NULL;
struct node* createnode(){
 struct node *n;
 n=(struct node *)malloc(sizeof(struct node));
 return(n);}
void insertnode(){
    struct node *temp1,*temp2;
    temp1=createnode();
    printf("\nEnter information  ");
    scanf("%d",&temp1->info);
    temp1->link=NULL;
    if(start==NULL){start=temp1;}
    else{
        temp2=start;
        while(temp2->link!=NULL){
            temp2=temp2->link;
            }
            temp2->link=temp1;}}
void printlist(){
    struct node *temp;
    if(start==NULL)
    printf("List is empty");
    else{temp=start;
        while(temp!=NULL){
            printf("  %d   ",temp->info);
            temp=temp->link;}}}
void deletenode(){
struct node *n;
if(start==NULL){
    printf("\nList is empty");}
    else{
        n=start;
    start=start->link;
    }
     free(n);
    }

main(){int ch=0;
    while(ch<4){
    printf("\n1:: insert node\n");
    printf("2:: print list\n");
    printf("\nchoose any one >> ");
    scanf("%d",&ch);
    if(ch==1){insertnode();}
    if(ch==2){printlist();}
    if(ch==3){deletenode();}
    }}
