#include <stdio.h>

void main()
{
    int num1, num2;
    printf("Enter A First Number : ");
    scanf("%d", &num1);
    printf("Enter A Second Number : ");
    scanf("%d", &num2);

    int max = (num1 > num2) ? num1 : num2;

    for (int i = max; i <= num1*num2; i++)
    {
        if (i%num1==0 && i%num2==0)
        {   
            printf("%d", i);
            break;
        }
        
    }
}