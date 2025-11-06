#include <stdio.h>

void main()
{
    int num1, num2;
    printf("Enter A First Number : ");
    scanf("%d", &num1);
    printf("Enter A Second Number : ");
    scanf("%d", &num2);

    for (int i = num1; i <= num2; i++){
        if(i%2==0){
            printf("%d,",i);
        }
    }
}