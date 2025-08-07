#include<stdio.h>
void main()
{
    int i,a,b;
    printf("Enter A Value:");
    scanf("%d",&a);
    printf("Enter B Value:");
    scanf("%d",&b);
    i=a+1;
    while(i<b)
    {
        if(i%2==0)
        {
            printf(" %d",i);
        }
        i++;
    }
}
