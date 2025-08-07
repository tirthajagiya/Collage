#include<stdio.h>
void main()
{
    int n,i,p_c=0,n_c=0;
    printf("Enter A Size Of Array:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A Element Of arr[%d]:",i);
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]>=0)
        {
            p_c=p_c+1;
        }
        else
        {
            n_c=n_c+1;
        }
    }
    printf("Positive Number Is:%d\n",p_c);
    printf("Negative Number Is:%d\n",n_c);
}