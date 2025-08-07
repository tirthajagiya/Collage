#include<stdio.h>
void main()
{
    int w,x,y,z,k,i,j;
    printf("Enter First Matrix Rows:");
    scanf("%d",&w);
    printf("Enter First Matrix Column:");
    scanf("%d",&x);
    printf("Enter First Matrix Rows:");
    scanf("%d",&y);
    printf("Enter First Matrix Column:");
    scanf("%d",&z);
    int mat1[w][x],mat2[y][x],mat3[i][j];
    if(x!=y)
    {
        printf("Multiplication Is Not Possible.");
    }
    else{
    for(i=0;i<w;i++)
    {
        for(j=0;j<x;j++)
        {
            printf("Enter %d%d Elemant For First Matrix:",i,j);
            scanf("%d",&mat1[i][j]);
        }
    }
    for(i=0;i<y;i++)
    {
        for(j=0;j<z;j++)
        {
            printf("Enter %d%d Elemant For Second Matrix:",i,j);
            scanf("%d",&mat2[i][j]);
        }
    }
        for(i=0;i<w;i++)
        {
            for(j=0;j<x;j++){
            for(k=0;k>=i;k++)
            {   
                mat3[i][j]=mat3[i][j]+mat1[i][j]*mat2[i][k];
                printf("%d ",mat3[i][j]);
            }
            }
            printf("\n");
        }
    }
}
