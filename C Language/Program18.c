#include<stdio.h>
void main()
{
    int a,b,c;
    printf("Enter A Value");
    scanf("%d",&a);
    printf("Enter A Value");
    scanf("%d",&b);
    printf("Enter A Value");
    scanf("%d",&c);
    if(a>b && a>c)
    {printf("A");}
    if(b>c && b>a)
    {printf("B");}
    if(c>a && c>b)
    {printf("C");}
}
