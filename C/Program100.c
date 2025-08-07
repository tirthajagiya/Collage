#include<stdio.h>
void main()
{
    int i,n,count=0;
    printf("Enter A Array Size:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]<0)
        {
            count++;
        }
    }
    printf("Negative Number In Array:%d",count);
}