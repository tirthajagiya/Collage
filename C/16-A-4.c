//Perform Addition of two matrices.
#include<stdio.h>
void main()
{
    int w,x,y,z,i,j;
    printf("Enter Matrix Rows:");
    scanf("%d",&w);
    printf("Enter Matrix Column:");
    scanf("%d",&x);
    
    int mat1[w][x],mat2[w][x];
    for(i=0;i<w;i++)
    {
        for(j=0;j<x;j++)
        {
            printf("Enter %d%d Elemant For First Matrix:",i,j);
            scanf("%d",&mat1[i][j]);
        }
    }
    for(i=0;i<w;i++)
    {
        for(j=0;j<x;j++)
        {
            printf("Enter %d%d Elemant For Second Matrix:",i,j);
            scanf("%d",&mat2[i][j]);
        }
    }
    for(i=0;i<w;i++)
    {
        for(j=0;j<x;j++)
        {
            printf("%d ",(mat1[i][j]+mat2[i][j]));
        }
        printf("\n");
    }
}
