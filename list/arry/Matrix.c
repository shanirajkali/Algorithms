#include<stdio.h>
main()
{
     int RoMa1,RoMa2,CoMa1,CoMa2,i,j,k;
     int Mat1[10][10],Mat2[10][10],MuMa[10][10],Sum=0;
     printf("Enter size of matrix\n");
     printf("Rows of 1st matrix :: ");
     scanf("%d",&RoMa1);
      printf("\nColoums of 1st matrix :: ");
     scanf("%d",&CoMa1);
     printf("\nRows of 2nd matrix :: ");
     scanf("%d",&RoMa2);
      printf("Coloum of 2nd matrix :: ");
     scanf("%d",&CoMa2);
     if(CoMa1==RoMa2)
     {

         printf("\nEnter first matrix");
         for(i=0;i<RoMa1;i++)
         {
             for(j=0;j<CoMa1;j++)
             {
                 scanf("%d",&Mat1[i][j]);
             }
         }

         printf("\nEnter second matrix");
         for(i=0;i<RoMa2;i++)
         {
             for(j=0;j<CoMa2;j++)
             {
                 scanf("%d",&Mat2[i][j]);
             }
         }
         printf("\nFirst matrix is\n");
          for(i=0;i<RoMa1;i++)
         {
             for(j=0;j<CoMa1;j++)
             {
                 printf("%d  ",Mat1[i][j]);
             }
             printf("\n");
         }
         printf("\nFirst matrix is\n");
          for(i=0;i<RoMa2;i++)
         {
             for(j=0;j<CoMa2;j++)
             {
                 printf("%d  ",Mat2[i][j]);
             }
             printf("\n");
         }
         printf("\nMultiplication is \n");

         for(i=0;i<RoMa1;i++)
         {
             for(k=0;k<CoMa2;k++)
             {
                 for(j=0;j<CoMa1;j++)
                 {
                     Sum= (Sum+(Mat1[i][j]*Mat2[j][k]));
                 }

                 MuMa[i][k]=Sum;
                 Sum=0;
             }

         }
         for(i=0;i<RoMa1;i++)
         {
             for(j=0;j<CoMa2;j++)
             {
                 printf("%d  ",MuMa[i][j]);
             }

                 printf("\n\n");

         }
     }


}
