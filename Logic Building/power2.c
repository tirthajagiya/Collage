#include <stdio.h>

void main(){
    int num1, num2, ans = 1;
    printf("Enter A Number : ");
    scanf("%d",&num1);
    printf("Enter A Number : ");
    scanf("%d",&num2);

    for(int i = 1; i<=num2; i++){
        ans *=num1;
        
    }

    printf("%d", ans);
}