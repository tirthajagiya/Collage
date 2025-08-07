#include<stdio.h>
void main()
{
    int i,n,max1,max2;
    printf("Enter A Array Size:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr[i]);
    }
    max1=arr[0];
    for(i=0;i<n;i++)
    {
        if(arr[i]>max1)
        {
            max1=arr[i];
        }
    }
    max2=arr[0];
    for(i=0;i<n;i++)
    {
        if(arr[i]>max2 && max2<max1)
        {
            max2=arr[i];
        }
    }
    printf("%d\n%d",max1,max2);
}