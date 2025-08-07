#include<stdio.h>
int swap(int *,int *);
void main()
{
    int a,b;
    printf("Enter A First Number:");
    scanf("%d",&a);
    printf("Enter  A Second Number:");
    scanf("%d",&b);
    swap(&a,&b);
    printf("%d And %d",a,b);
}
int swap(int *x,int *y)
{
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
}