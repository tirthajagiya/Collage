#include<stdio.h>
void main()
{
    int a,c1=0,c2=0,i=1;
    while(i<=10)
    {
        printf("Enter Value:");
        scanf("%d",&a);
        if(a%2==0)
        {
            c2=c2+1;
        }
        else{
            c1=c1+1;
            }
            i++;
    }
    printf("ODD NUM:%d EVEN NUM:%d",c1,c2);
}
