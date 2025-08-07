#include<stdio.h>
void main()
{
    int a,b;
    printf("Enter A First Value:");
    scanf("%d",&a);
    printf("Enter A Second Value:");
    scanf("%d",&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("%d,%d",a,b);
}
