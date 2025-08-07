#include<stdio.h>
void main()
{
    int a=10;
    int *ptr;
    ptr=&a;
    // printf("%d \n %d",a,&a);
    printf("%p\n",ptr);
    printf("\n%d",*ptr);
}