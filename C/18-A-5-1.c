#include<stdio.h>
int swap(int ,int);
void main()
{
    int a,b;
    printf("Enter A First Number:");
    scanf("%d",&a);
    printf("Enter A Second Number:");
    scanf("%d",&b);
    int p=swap(a,b);
}
int swap(int a,int b)
{
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("First Value Is:%d, And Second Value Is:%d\n",a,b);
}