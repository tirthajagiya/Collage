#include<stdio.h>
void main()
{ 
    int a,b;
    printf("Enter A Value:");
    scanf("%d",&a);
    printf("Enter A Value:");
    scanf("%d",&b);
    int *ptr1=&a,*ptr2=&b;
    printf("%d",(*ptr1+*ptr2));
}