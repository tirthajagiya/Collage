#include <stdio.h>

void main()
{
    int n1, n2, temp = 0;
    printf("Enter First Array size :");
    scanf("%d", &n1);
    printf("Enter Second Array size :");
    scanf("%d", &n2);
    int arr1[n1], arr2[n2], arr3[n1 + n2];

    for (int i = 0; i < n1; i++)
    {
        printf("Enter %d element of first Array : ", i + 1);
        scanf("%d", &arr1[i]);
    }

    for (int j = 0; j < n2; j++)
    {
        printf("Enter %d element of second Array : ", j + 1);
        scanf("%d", &arr2[j]);
    }

    
}