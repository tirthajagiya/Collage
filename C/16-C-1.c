#include<stdio.h>
void main()
{
    int i,j,rows,sum=0,column;
    printf("Enter A Row NUmber Of Matrix:");
    scanf("%d",&rows);
    printf("Enter A Column Number Of Matrix:");
    scanf("%d",&column);
    int mat[rows][column];
    for(i=0;i<rows;i++)
    {
        for(j=0;j<column;j++)
        {
            printf("Enter %d%d Elemant:",i,j);
            scanf("%d",&mat[i][j]);
        }
    }
     for(i=0;i<rows;i++)
    {
        for(j=0;j<column;j++)
        {
            if(mat[i][j]==0)
            {
                sum++;
            }
        }
    }
    if(((rows*column)/2)<sum)
    {
    printf("This Matrix Is Sparse.");
    }
    else{
         printf("This Matrix Is Not Sparse.");
    }
}