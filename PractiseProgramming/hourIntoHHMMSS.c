#include <stdio.h>

int main()
{
    int second;
    int minute = 0;
    int hour = 0;
    printf("Enter Second :");
    scanf("%d", &second);
    hour = second / 3600;
    second = second % 3600;

    minute = second / 60;
    second = second % 60;
    printf("%02d:%02d:%02d", hour, minute, second);
    return 0;
}