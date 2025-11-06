#include <stdio.h>

// 1
// 01
// 101
// 0101
// 10101

void main()
{
    int n;
    printf("Enter Number : ");
    scanf("%d", &n);
    
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; i >= j; j++)
        {
            if ((i + j) % 2 != 0)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
        }
        printf("\n");
    }
}