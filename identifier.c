#include <stdio.h>
#include <ctype.h>

int main() {
    char str[100];
    int i, flag = 1;

    printf("Enter a string: ");
    scanf("%s", str);

    // First character must be a letter or underscore
    if (!isalpha(str[0]) && str[0] != '_') {
        flag = 0;
    }

    // Remaining characters must be letters, digits, or underscore
    for (i = 1; str[i] != '\0'; i++) {
        if (!isalnum(str[i]) && str[i] != '_') {
            flag = 0;
            break;
        }
    }

    if (flag=1)
        printf("Valid identifier\n");
    else
        printf("Not a valid identifier\n");

    return 0;
}