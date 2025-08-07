#include<stdio.h>
void main()
{
    int a,i=1;
    printf("Enter A VAlue:");
    scanf("%d",&a);
    while(a>=i)
    {
        if(i%2!=0)
        {
            printf("%d",i);
        }
        i++;
    }
}
