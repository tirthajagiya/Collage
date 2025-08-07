#include<stdio.h>
void main()
{
    int a,b,c;
    printf("Enter A Value:");
    scanf("%d",&a);
    printf("Enter A Value:");
    scanf("%d",&b);
    printf("Enter A Value:");
    scanf("%d",&c);
    (a>b)?(a>c)?printf("A"):printf("C"):(b>c)?printf("B"):printf("C");
}
