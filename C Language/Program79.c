#include<stdio.h>
void main()
{
    int i,j,n=10;
    float d=1,fac=1;
        for(i=1;i<=n;i++)
    {
        fac=1;
        for(j=1;j<=i;j++)
        {
            fac=fac*j;
        }
        d=d+(1.0/fac);
    }
    printf("%f",d);
}