#include<stdio.h>
void main()
{
    int a,i=1;
    printf("Enter A No:");
    scanf("%d",&a);
    while(i<=a)
    {
        if(a%i==0)
        {
            printf("%d Factor Is:%d\n",a,i);
        }
        i++;
    }
}