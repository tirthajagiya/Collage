#include<stdio.h>
void main()
{
    int n=5,i,count1=0,count2=0;
    int arr1[n],arr2[n];
    for(i=0;i<n;i++)
    {
        printf("Hight[%d]:",i);
        scanf("%d",&arr1[i]);
    }
    for(i=0;i<n;i++)
    {
        printf("Wight[%d]:",i);
        scanf("%d",&arr2[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr1[i]>170)
        {
            count1=count1+1;
        }
        
        if(arr2[i]<50)
        {
            count2=count2+1;
        }
    }
    printf("%d\n%d",count1,count2);
}    