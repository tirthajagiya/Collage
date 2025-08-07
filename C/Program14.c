#include<stdio.h>
void main()
{
    int a,b,c;
    printf("Enter A First Value:");
    scanf("%d",&a);
    printf("Enter A Second Value:");
    scanf("%d",&b);
    c=a;      
    a=b;
    b=c;
    printf("a=%d b=%d",a,b);
}
