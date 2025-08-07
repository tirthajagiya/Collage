#include<stdio.h>
void main()
{
    int a=10;
    int *ptr1=&a;
    float b=10.00;
    float *ptr2=&b;
    char c='a';
    char *ptr3=&c;
    double e=20;
    double *ptr4=&e;
    printf("%d\n",*ptr1);
    printf("%p\n",ptr1);
    printf("%f\n",*ptr2);
    printf("%p\n",ptr2);
    printf("%c\n",*ptr3);
    printf("%p\n",ptr3);
    printf("%lf\n",*ptr4);
    printf("%p\n",ptr4);
}