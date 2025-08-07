#include<stdio.h>
void main()
{
    int n,a;
    printf("Enter A Value");
    scanf("%d",&n);
    a=n%10;
    while(n>9)
    {
        n=n/10;
    }
    printf("%d",n+a);
}