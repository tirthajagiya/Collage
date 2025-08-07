#include<stdio.h>
void main()
{
    int n,rem;
    printf("Enter A Decimal Number:");
    scanf("%d",&n);
    while(n!=0)
    {
        rem=n%2;
        n=n/2;
        printf("%d",rem);
    }
}