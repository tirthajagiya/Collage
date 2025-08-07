#include<stdio.h>
void main()
{
    int n,i;
    printf("Enter Array Size:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A Element Of arr[%d]\n",i);
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            printf("arr[%d]=%d is Even\n",i,arr[i]);
        }
        else
        {
            printf("arr[%d]=%d is Odd\n",i,arr[i]);
        }
    }
}