#include<stdio.h>
void main()
{
    int n,i,t1,t2,nextterm;
    t1=0;
    t2=1;
    nextterm=t1+t2;     
    scanf("%d",&n);
    for(i=3;i<=n;i++)
    {
        t1=t2;
        t2=nextterm;
        nextterm=t1+t2;
        printf("%d,",nextterm);
    }
}