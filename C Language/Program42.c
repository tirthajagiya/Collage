#include<stdio.h>
void main()
{
    int a,ans=0,i=1;
    printf("Enter A Value:");
    scanf("%d",&a);
    while(i<=a)
    {
        ans=ans+i;
        i++;
    }
     printf("%d",ans);
}
