#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#define N 100000

void best_case_100000()
{
    char fileName[50];
    sprintf(fileName, "best_case_%d.txt", N);

    FILE *fp = fopen(fileName, "w");

    for (int i = 1; i <= N; i++)
    {
        fprintf(fp, "%d ", i);
    }

    fclose(fp);
}

void average_case_100000()
{
    char fileName[50];
    sprintf(fileName, "average_case_%d.txt", N);

    FILE *fp = fopen(fileName, "w");

    int arr[N];

    for (int i = 0; i < N; i++)
    {
        arr[i] = i + 1; 
    }

    srand(time(NULL));
    for (int i = N-1 ; i >=0 ; i--)
    {
        int j = rand() % (i+1);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    for(int i = 0; i<N; i++){
        fprintf(fp, "%d ",arr[i]);
    }

    fclose(fp);
}

void worst_case_100000()
{
    char fileName[50];
    sprintf(fileName, "worst_case_%d.txt", N);

    FILE *fp = fopen(fileName, "w");

    for(int i = N ; i>0 ; i--){
        fprintf(fp, "%d ", i);
    }
    fclose(fp);
}

void main()
{
    best_case_100000();
    average_case_100000();
    worst_case_100000();
    printf("Your 3 File is ready");
}