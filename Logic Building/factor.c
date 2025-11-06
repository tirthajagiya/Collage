#include <stdio.h>

void main()
{
    int n;
    printf("Enter A Number : ");
    scanf("%d", &n);

    for (int i = 1; i < n; i++)
    {
        if (n % i == 0)
        {
            printf("%d,", i);
        }
    }
}