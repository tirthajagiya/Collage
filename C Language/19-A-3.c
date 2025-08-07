#include<stdio.h>
#include<string.h>
void main()
{
    char a[100],b[100];
    printf("Enter A First String:");
    gets(a);
    printf("Enter A Second String:");
    gets(b);
    printf("%s",strlen(a));
    printf("\n%s",strcmp(a,b));
    printf("\n%s",strcpy(a,b));
    printf("\n%s",strcat(a,b));
    printf("\n%s",strrev(a));
    printf("\n%s",strlwr(a));
    printf("\n%s",strupr(b));
}

