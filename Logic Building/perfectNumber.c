#include <stdio.h>

void main()
{
    int n, sum = 0;
    printf("Enter A Number : ");
    scanf("%d", &n);

    for (int i = 1; i < n; i++)
    {
        if(n%i==0){
            sum+=i;
        }
    }

    if(sum==n){
        printf("Perfact Number");
    }
    else{
        printf("Not Perfact Number");
    }
}