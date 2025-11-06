#include <stdio.h>

void main(){
    int n,sum=0;
    printf("Enter A Number : ");
    scanf("%d",&n);
    for(int i=1; i<=n;i++){
        sum+=i;
    }
    printf("Sum is : %d",sum);
}