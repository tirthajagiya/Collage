#include <stdio.h>

void main(){
    int n,rem;
    printf("Enter A Number : ");
    scanf("%d",&n);
    while(n!=0){
        rem=n%10;
        printf("%d,",rem);
        n=n/10;
    }
}