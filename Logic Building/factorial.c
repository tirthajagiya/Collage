#include <stdio.h>

void main(){
    int n,ans=1;
    printf("Enter A Number : ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        ans*=i;
    }
    printf("Factorial is : %d",ans);
}