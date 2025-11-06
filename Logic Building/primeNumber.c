#include <stdio.h>

void main(){
    int n, sum=0, temp = 1;
    printf("Enter Number: ");
    scanf("%d",&n);
    for(int i = 2; i<(n/2); i++){
        if(n%i==0){

            temp = 0;
            break;
        }
    }

    if(temp == 0){
        printf("Not Prime.");
    }
    else{
        printf("Prime");
    }
    
}