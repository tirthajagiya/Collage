#include <stdio.h>

void main()
{
    int n, flag = 0;
    printf("Enter Number : ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            printf("%d", i);
            if (i != 2 && i != 3 && i != 5)
            {

                for (int j = 1; j <= (i / 2); j++)
                {
                    if (i % j == 0)
                    {
                        flag = 1;
                    }
                }
                if (flag == 1)
                {
                    printf("Not Ugly");
                    return;
                }
            }
        }
    }

    printf("Ugly");
}