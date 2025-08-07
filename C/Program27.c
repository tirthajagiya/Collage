#include<stdio.h>
void main()
{
    int a,b,c,d,e,pr;
    printf("Enter 1 Subject Mark:");
    scanf("%d",&a);
    printf("Enter 2 Subject Mark:");
    scanf("%d",&b);
    printf("Enter 3 Subject Mark:");
    scanf("%d",&c);
    printf("Enter 4 Subject Mark:");
    scanf("%d",&d);
    printf("Enter 5 Subject Mark:");
    scanf("%d",&e);
    pr=(a+b+c+d+e)/5;
    if(70<pr)
    {
        printf("Distinction.");
    }
    else if(pr>=61 && 70>=pr)
    {
        printf("First Class.");
    }
    else if(pr>=46 && 60>=pr)
    {
        printf("Second Class.");
    }
    else if(pr>=36 && pr<=45)
    {
        printf("Pass Class.");
    }
    else if(pr<=35)
    {
        printf("Fail.");
    }
}
