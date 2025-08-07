#include<stdio.h>
void main()
{
    int i,n,a,count=0;
    printf("Enter A Array Size:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr[i]);
    }
    printf("Please Enter A Number You Find In Array:");
    scanf("%d",&a);
    for(i=0;i<n;i++)
    {
        if(a==arr[i])
        {
            printf("INDEX:%d",i);
        }
    }
}