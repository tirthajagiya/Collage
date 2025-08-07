#include<stdio.h>
int fact(int );
void main()
{
    int n;
    printf("Enter A Number:");
    scanf("%d",&n);
    int p=fact(n);
    printf("Factorial Is:%d",p);
}
int fact(int n)
{
    if(n==0)
    {
        return 1;
    }
    else if(n==1)
    {
        return 1;
    }
    else
    {
        return fact(n-1)*n;
    }
}