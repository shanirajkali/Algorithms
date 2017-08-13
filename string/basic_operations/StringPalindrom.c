#include<stdio.h>
#include<string.h>
#include<conio.h>
int cpy(char *, char *);
int lenth(char *);
int rev(char *);
int cmp(char *,char *);
int main()
{
    char s[20],t[20];
    printf("enter string \n");
    scanf("%[^\n]s",s);
    cpy(t,s);
    rev(s);
    if(cmp(s,t)==0)printf("palindrome");
    else printf("not palindrome");
    getch();
    return 0;
}
int cpy(char *t, char *s)
{char *temp1,*temp2;
temp1=s;
temp2=t;
while(*temp1!='\0')
{
    *temp2=*temp1;
    temp1++;
    temp2++;

}
*temp2='\0';
return 0;


}
int lenth(char *s)
{
    int len=0;
    while(*s!='\0')
    {
        len++;
        s++;

    }
    return (len);
}
int rev(char *s)
{
  char *bigin,*end,temp;
  int len,c;
  bigin=s;
  end=s;
  len=lenth(s);
  for(c=0;c<len-1;c++)
    end++;
  for(c=0;c<len/2;c++)
  {
      temp=*end;
      *end=*bigin;
      *bigin=temp;
      end--;
      bigin++;


  }
}
int cmp(char *s,char *t)
{
    while((*s!='\0')&&(*t!='\0'))
    {
        if(*s!=*t)
            return (-1);
        s++;
        t++;

    }
    if(*s!=*t)
        return (-1);
    else
        return 0;

}
