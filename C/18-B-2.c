#include<stdio.h>
#include<math.h>
int prime(int );
int amstrong(int);
int perfact(int);
int main()
{
    int n;
    printf("Enter A Number:");
    scanf("%d",&n);
    if(prime(n))
    {
        printf("Number Is Prime.");
    }
    else
    {
        printf("Number Is Not Prime.");
    }
    if(amstrong(n))
    {
        printf("Number Is Armstrong.");
    }
    else
    {
        printf("Number Is Not Armstrong.");
    }
    return 0;
}
int prime(int n)
{
    int i;
    for(i=2;i<=(n/2);i++)
    {
        if(n%i==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
}
int amstrong(int n)
{ 
    int on,q,count=0;
    double sum;
    on=n;
    q=n;
    while(n!=0)
    {
        n=n/10;
        count++;
    }
    while(on!=0)
    {
        on=on/10;
        sum+=pow(on,count);
    }
    return(sum==q);   
}