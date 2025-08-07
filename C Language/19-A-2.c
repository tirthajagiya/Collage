#include<stdio.h>
void array(int arr[], int n);
void main()
{
    int n,i;
    printf("Enter A Elemant Size:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter %d Elemant.\n",i);
        scanf("%d",&arr[i]);
    }
    array(arr,n);
}
void array(int arr[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }
}