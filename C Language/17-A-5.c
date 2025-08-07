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
    for(i=0;i<n;i++)
    {
        printf("%d\n",*(ptr+i));
    }
}