#include<stdio.h>
void main()
{
    int i,n;
    printf("ENTER A ELEMENT SIZE:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr[i]);
    }
    int *ptr=arr;
    int arr2[n];
    arr2=*(ptr+i);
    for(i=0;i<n;i++)
    {
        printf("%d",arr2[n]);
    }
}