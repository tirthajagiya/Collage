#include<stdio.h>
int fibbo(int ,int );
void main()
{
    int m;
    printf("Enter A NO:");
    scanf("%d",&m);

}
int fibbo(int i,int n)
{
    i=1;
    n=1;
    //int p;
    while(m>=n)
    {
        i=i+n;
        n=i+n;
        printf("%d\n",i);
    }
}