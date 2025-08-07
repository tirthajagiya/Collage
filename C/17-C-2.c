#include<stdio.h>
void main()
{
    int n,i,j,temp;
    printf("ENTER ARRAY SIZE:");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter A %dElemant",(i+1));
        scanf("%d",&arr[i]);
    }
    int *ptr=arr;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=*(ptr+j);
                *(ptr+j)=*(ptr+i);
                *(ptr+i)=temp;
            }
        }
        printf("%d",*(ptr+i));
    }
}