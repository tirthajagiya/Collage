#include<stdio.h>
void main()
{
     int i=1,n,fac=1;
     printf("Enter A Number:");
     scanf("%d",&n);
     while(n>=i)
     {
        fac=fac*i;
        i++;
     }
     printf("Factorial Is:%d",fac);
}