#include <stdio.h>

void main()
{
    int n, rev_num = 0, m=n;
    printf("Enter Number : ");
    scanf("%d", &n);

    while (n != 0)
    {
        rev_num = rev_num * 10 + (n % 10);
        n = n / 10;
    }

    if(m == rev_num)
    {
        printf("Palindrom Number");
    }
    else
    {
        printf("Not Palindrom Number");
    }
}