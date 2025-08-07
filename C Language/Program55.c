#include<stdio.h>
void main()
{
    int n;
    printf("Enter A Number:");
    scanf("%d",&n);
    while(n!=0)
    {
        n=n/10;
    }
}