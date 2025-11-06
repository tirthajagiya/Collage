#include <stdio.h>
void main()
{
    int n, rem = 0, binary = 0;
    printf("Enter Number : ");
    scanf("%d", &n);

    while (n != 0)
    {
        rem = n % 2;
        n /= 2;
        binary = binary * 10 + rem;
    }

    printf("%d", binary);
}