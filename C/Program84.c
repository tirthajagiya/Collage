#include<stdio.h>
void main()
{
    int n,i;
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
        printf("Normal Order Is:%d\n",arr[i]);
    }
    for(i=n-1;i>=0;i--)
    {
        printf("Reverse Order Is:%d\n",arr[i]);
    }
}