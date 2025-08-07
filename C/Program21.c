#include<stdio.h>
void main()
{
    int n;
    printf("Enter A Value:");
    scanf("%d",&n);
    if(n&1==1)
    {printf("Number Is Odd.");}
    else{printf("Number Is Even.");}
}
