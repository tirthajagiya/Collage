#include<stdio.h>

void main(){
    int x,y;
     int pos=0,neg=0,zero=0;
    printf("Enter Length of Array: ");
    scanf("%d",&x);
    printf("Enter Width of Array: ");
    scanf("%d",&y);

    int a[x][y],i,j;
    for(i=0;i<x;i++){
        for(j=0;j<y;
        j++){
            printf("Enter Number:");
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<x;i++)
    {
        for(j=0;j<y;j++)
        {
           if(a[i][j]>0)
           {
                pos++;
           }
           if(a[i][j]<0)
           {
                neg++;
           } 
           if(a[i][j]==0)
           {
                zero++;
           }
        }
    }
    printf("Positive Number Is:%d,Nagative Number Is: %d,Zero Number Is: %d,",pos,neg,zero);
}