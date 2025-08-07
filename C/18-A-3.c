#include<stdio.h>
int intrest(int ,int ,int );
void main()
{   int p,r,t,val;
    printf("Enter p Value:");
    scanf("%d",&p);
    printf("Enter r Value:");
    scanf("%d",&r);
    printf("Enter t Value:");
    scanf("%d",&t);
    int a=intrest(p,r,t);
    printf("Simple Intrest Is:%d",a);
}
int intrest(int p,int r,int t)
{
    int val;
    val=(p*r*t)/100;
    return val;
}