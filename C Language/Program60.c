#include<stdio.h>
void main()
{
    int m,n,i,sum=0,avg;
    printf("Enter A Number:");
    scanf("%d",&m);
    for(i=1;i<=m;i++)
    {
        printf("Enter %d Number",i);
        scanf("%d",&n);
        sum=sum+n;
    }
    avg=sum/m;
    printf("Sum:%d And Avarage:%d",sum,avg);
}