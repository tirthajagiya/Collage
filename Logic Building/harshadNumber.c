#include <stdio.h>

void main()
{
    int n, sum = 0;
    int m = n;
    printf("Enter Number : ");
    scanf("%d", &n);

    while (n != 0)
    {
        sum += n % 10;
        n /= 10;
    }

    if (m / sum == 0)
    {
        printf("Harshad Number");
    }
    else
    {
        printf("Not Harshad Number");
    }
}