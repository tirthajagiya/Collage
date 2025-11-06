#include <stdio.h>

void main()
{
    int num1, num2, ans = 1;
    printf("Enter First Number : ");
    scanf("%d", &num1);
    printf("Enter Second Number : ");
    scanf("%d", &num2);
    for (int i = 0; i < num2; i++)
    {
        ans *= num1;
    }
    printf("Power is : %d",ans);
}