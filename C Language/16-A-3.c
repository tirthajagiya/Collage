#include<stdio.h>
void main()
{
    int i,j,roll[20][1],mark[20][1];
    for(i=0;i<20;i++)
    {
        for(j=0;j<1;j++)
        {
            printf("Enter Roll No:");
            scanf("%d",&roll[i][j]);
            printf("Enter Roll No: %d Mark:",roll[i][j]);
            scanf("%d",&mark[i][j]);
        }
    }
    for(i=0;i<20;i++)
    {
        for(j=0;j<1;j++)
        {
            printf("%d\n",roll[i][j]);
            printf("%d\n",mark[i][j]);
        }
    }
}