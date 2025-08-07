#include<stdio.h>
void main()
{
    int a,b,c;
    float d;
    
    printf("Enter A First Value:");
    scanf("%d",&a);
    printf("Enter A Second Value:");
    scanf("%d",&b);
    printf("Enter A Third Value:");
    scanf("%d",&c);
    d=(a+b+c)/3.0;
    printf("%f",d);
}
