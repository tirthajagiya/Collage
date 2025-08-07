#include<stdio.h>
void main()
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    switch(a>b)
    {
        case 1:printf("%d",a*c);
        break;

        case 0:printf("%d",b*c);
        break;
    }
}