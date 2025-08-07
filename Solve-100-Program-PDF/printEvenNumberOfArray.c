#include <stdio.h>

void main(){
    int size;
    printf("Enter size of array : ");
    scanf("%d",&size);
    int numbers[size];

    int i;
    int sum = 0;
    for(i=0 ; i<size ;i++){
        printf("Enter %d element : ", (i+1));
        scanf("%d",numbers[i]);
        // if(numbers[i]%2==0){
        //     sum++;
        // }
    }

    printf("%d", sum);
}