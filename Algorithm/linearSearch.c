#include <stdio.h>

void applyLeanearSearch(int arr[], int size){
    printf("What you want to find in array : ");
    int num;
    scanf("%d",&num);

    int i = 0;
    

    for(i;i<size;i++){
        if(num == arr[i]){
            printf("Number find in this array %d index",i);
            break;
        }
    }
    printf("Number not found");
}

void main(){
    int arr[] = {12,15,10,5,20,25};
    int size = sizeof(arr)/4;
    applyLeanearSearch(arr,size);
}