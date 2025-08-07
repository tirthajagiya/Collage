#include<stdio.h>
void main()
{
    int w,x,i,j;
    printf("Enter Matrix Rows:");
    scanf("%d",&w);
    printf("Enter Matrix Column:");
    scanf("%d",&x);
    
    int mat1[w][x];
    for(i=0;i<w;i++)
    {
        for(j=0;j<x;j++)
        {
            printf("Enter %d%d Elemant For Matrix:",i,j);
            scanf("%d",&mat1[i][j]);
        }
    }
    for(j=0;j<x;j++)
    {
        for(i=0;i<w;i++)
        {
            printf("%d ",mat1[i][j]);
        }
        printf("\n");
    }
}