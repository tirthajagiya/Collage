#include<stdio.h>
void main()
{
    int n,i,c1=0,c2=0;
    printf("Enter A Size Of Array:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A Element Of arr[%d]:",i);
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            c1=c1+1;
        }
        else
        {
            c2=c2+1;
        }
    }
    printf("Odd Number Is:%d\n",&c2);
    printf("Even Number Is:%d\n",&c1);
}