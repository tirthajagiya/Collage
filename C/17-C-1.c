#include <stdio.h>
#include <string.h>
 
void main()
{
    char str[20],*ptr;
    int i,count=0;
    printf("Enter the String: ");
    gets(str);
    ptr=str;
    for(ptr=str;*ptr!='\0';ptr++)
    {
        count++;
    }
    printf("Length of Str is %d", count);
}