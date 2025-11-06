#include <stdio.h>

void main()
{
    int num1, num2, gcd;
    printf("Enter A First Number : ");
    scanf("%d", &num1);
    printf("Enter A Second Number : ");
    scanf("%d", &num2);

    int min = (num1 > num2) ? num2 : num1;

    for (int i = 1; i <= min; i++)
    {
        if (num1 % i == 0 && num2 % i == 0)
        {
            gcd = i;
        }
    }

    printf("%d",gcd);
}