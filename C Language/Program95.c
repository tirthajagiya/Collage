#include<stdio.h>
#include<math.h>
void main()
{
    int n,i,sum=0,avg,mul=1;
    float geo,har,sum2=0;
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
        sum=sum+arr[i];
    }
    avg=sum/n;
    printf("Avarage is :%d",avg);
    for(i=0;i<n;i++)
    {
        mul=mul*arr[i];
    }
    printf("%d",mul);
    geo=pow(mul,(float)1/n);
    printf("\nGeo=%f",geo);
    for(i=0;i<n;i++)
    {
       sum2=sum2+((float)1/arr[i]);
    }
    har=n/sum2;
    printf("\nHar:%f",har);
}
