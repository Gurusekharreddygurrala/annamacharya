#include <stdio.h>
#include <string.h>

int main() {
    char str[1000];

    printf("Enter a line: ");
    scanf(" %[^\n]",str);
    if(str[0]=='/'&&str[1]=='/'){
        printf("single line comment");
    }
    else if(str[0]=='/'&&str[1]=='*')
    {
        printf("multi line comment");
    }
    else{
        printf("not a comment");
    }
}
