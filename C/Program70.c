#include<stdio.h>
void main()
{
    int fac=1,n,i;
    printf("Enter A Number:");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        fac=fac*i;
    }
    printf("%d",fac);
}