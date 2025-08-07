#include<stdio.h>
void main()
{
    int i=1,j=1,k,p,n;
    scanf("%d",n);
    for(p=1;p<=n;p++)
    {
        k=i+j;
        i=j;
        j=k;
        printf("%d,",k);
    }
}