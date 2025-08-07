#include<stdio.h>
void main()
{
    float a,b;
    char c;
    scanf("%f",&a);
    scanf("%c",&c);
    scanf("%f",&b);
    switch(c)
    {
        case '+':printf("%f",a+b);
        break;
        case '-':printf("%f",a-b);
        break;
        case '*':printf("%f",a*b);
        break;
        case '/':printf("%f",a/b);
        break;
    }
}
