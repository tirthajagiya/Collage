#include<stdio.h>
float max(int ,int ,int );
void main()
{
    float a,b,c;
    printf("Enter First Value:");
    scanf("%f",&a);
    printf("Enter Second Value:");
    scanf("%f",&b);
    printf("Enter Third Value:");
    scanf("%f",&c);
    float p=max(a,b,c);
    printf("Max Value Is:%f",p); 
}
float max(int a,int b,int c)
{
    if(a>b)
    {
        if(a>c)
        {
            return a;
        }

        else
        {
            return c;
        }
    }
    else
    {
        if(b>c)
        {
            return b;
        }

        else
        {
            return c;
        }
    }
}