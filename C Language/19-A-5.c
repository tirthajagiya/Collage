#include<stdio.h>
void main()
{
    char a,b,str[1000];
    int i;
    printf("Enter A String:");
    gets(str);
    printf("Enter The character to be replaced\n");
    scanf("%c",&a);
    printf("Enter The character to replace");
    scanf("%c",&b);
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i]==a)
        {
            str[i]=b;
        }
    }
    printf("Your String Is:");
    puts(str);
}