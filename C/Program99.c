#include<stdio.h>
void main()
{
    int i,n;
    printf("Enter A Array Size:");
    scanf("%d",&n);
    int arr[n],arr2[100];
    for(i=0;i<n;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        arr2[i]=arr[i];
        printf("%d\n",arr2[i]);
    }
}