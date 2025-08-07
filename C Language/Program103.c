#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
    int i;
    printf("Enter A String:");
    scanf("%s",str);
    for(i=1;str[i]!='\0';i++);
    printf("Your String Length Is:%d",i);
}