#include<stdio.h>
void main()
{
    int i,j,n;
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
        for(j=i+1;;j++)
        {
            printf("%d",arr[j]);
        }
    }
}