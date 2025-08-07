#include<stdio.h>
void main()
{
    int n,i,count=0;
    printf("Enter A Number:");
    scanf("%d",&n);
    for(i=2;(n/2)>=i;i++)
    {   
        if(n%i==0)
        {
            count=count+1;
        }
     }
     if(count==0)
     {
        printf("Prime.");
     }
     else
     {
        printf("Not Prime.");
     }
}