#include <stdio.h>

void main()
{
    int n, sum = 0;

    printf("Enter Number :");
    scanf("%d", &n);
    int m = n;
    int a;
    while (n != 0)
    {
        a = n % 10;
        sum += (a * a * a);
        n = n / 10;
    }
    if (sum == m)
    {
        printf("Armstrong Number");
    }
    else
    {
        printf("Not Armstrong");
    }
}