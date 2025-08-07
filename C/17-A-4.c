#include<stdio.h>
void main()
{
    int a,b;
    printf("Enter A Value:");
    scanf("%d",&a);
    printf("Enter A Value:");
    scanf("%d",&b);
    int *ptr1=&a,*ptr2=&b,*temp;
    *temp=*ptr1;
    *ptr1=*ptr2;
    *ptr2=*temp;
    printf("%d\n%d",*ptr1,*ptr2);  
}