#include<stdio.h>
void main()
{
    int n,i,count=0,avg,sum=0;
    printf("Enter A Array Size");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A %d Elemant arr[%d]",i,i);
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    avg=sum/n;
    for(i=0;i<n;i++)
    {
        if(arr[i]>avg)
        {
            count=count+1;
        }
    }
    printf("%d",count);
}