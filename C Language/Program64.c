#include<stdio.h>
void main()
{
    int n,i=1,count=0;
    printf("Enter A Number:");
    scanf("%d",&n);
    while(n>i)
    {
        if(n%i==0)
        {
            count=count+i;
        }
        i++;
    }
    if(count==n)
    {
        printf("Perfact");
    }
    else
    {
        printf("Not Perfact");
    }
}