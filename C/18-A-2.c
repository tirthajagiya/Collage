#include<stdio.h>
int max(int,int);
int min(int ,int);
void main()
{
    int a,b;
    printf("Enter First Value:");
    scanf("%d",&a);
    printf("Enter Second Value:");
    scanf("%d",&b);
    int p=max(a,b);
    int q=min(a,b);
    printf("%d Number Is Max.",p);
    printf("\n%d Number Is Min.",q);

}
int max(int a,int b)
{
    if(a>b)
    {
        return a;
    }
    else
    {
        return b;
    }
}
int min(int a,int b)
{
    if(a<b)
    {
        return a;
    }
    else
    {
        return b;
    }
}


