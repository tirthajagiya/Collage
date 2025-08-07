#include<stdio.h>
int sum(int ,int );
void main()
{
    int a,b,c;
    printf("Enter First Value:");
    scanf("%d",&a);
    printf("Enter Second Value:");
    scanf("%d",&b);
    int r=sum(a,b);
    printf("%d",r);
}
int sum(int a,int b)
{
    int c;
    c=a+b;
    return c;
}