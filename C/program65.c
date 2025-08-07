#include<stdio.h>
void main()
{
    int n,m,p,rev=0;
    printf("Enter A Number");
    scanf("%d",&n);
    p=n;
    while(p>0)
    {
        m=p%10;
        p=p/10;
        rev=rev*10+m;
    }
    if(n==rev)
    {
        printf("Pal");
    }
    else
    {
        printf("Not Pal");
    }
}