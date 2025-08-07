#include<stdio.h>
void main()
{
    int i,n,m;
    printf("ENTER A ELEMENT SIZE:");
    scanf("%d",&m);
    int arr1[m];
    for(i=0;i<m;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr1[i]);
    }
    printf("ENTER A ELEMENT SIZE:");
    scanf("%d",&n);
    int arr2[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A arr[%d]",i);
        scanf("%d",&arr2[i]);
    }
    int *ptr1=arr1,*ptr2=arr2;
    for(i=0;i<n;i++)
    {
        printf("\nSecond Array:%d",*(ptr2+i));
    }
    for(i=0;i<m;i++)
    {
        printf("\nFirst Array:%d",*(ptr1+i));
    }
}