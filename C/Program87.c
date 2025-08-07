#include<stdio.h>
void main()
{
    int n,i,max,min,sum=0,avg;
    printf("Enter A Size Of Array:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A Element Of arr[%d]:",i);
        scanf("%d",&arr[i]);
    }
    max=arr[0];
    min=arr[0];
    for(i=0;i<n;i++)
    {
        sum=sum+arr[i]
        if(arr[i]>max)
        {
            max=arr[i]
        }
        if(arr[i]<min)
        {
            min=arr[i]
        }
    }
    avg=sum/n;
    printf("Sum:%d",sum);
    printf("Avarage:%d",avg);
    printf("Min:%d",min);
    printf("Max:%d",max);
}    
