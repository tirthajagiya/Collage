#include<stdio.h>
void main()
{
    int a;
    printf("Please Enter A Value.");
    scanf("%d",&a);
    if(a%2==1)
    {
        printf("%d Number Is Odd.",a);
    }
    else
    {
        printf("%d Number Is Even.",a);
    }
}
