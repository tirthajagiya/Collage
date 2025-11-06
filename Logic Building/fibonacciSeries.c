#include <stdio.h>

void main()
{
    int n, first = 0, second = 1, next;
    printf("Enter Number : ");
    scanf("%d", &n);

    while (n != 0)
    {
        printf("%d,", first);
        next = first + second;
        first = second;
        second = next;
        n--;
    }
}